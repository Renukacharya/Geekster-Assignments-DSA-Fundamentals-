package linkedList;

public class ImplementLL {
	Node head;	 
    static class Node {
 
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
    public static ImplementLL insert(ImplementLL list,
                                    int data)
    {
        Node new_node = new Node(data);
        new_node.next = null;
        if (list.head == null) {
            list.head = new_node;
        }
        else {
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_node;
        }
        return list;
    }
    public static void printList(ImplementLL list)
    {
        Node currNode = list.head;
 
        System.out.print("ImplementLL: ");
        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
 
        System.out.println();
    }
 
    public static ImplementLL deleteByKey(ImplementLL list,
                                         int key)
    {
        Node currNode = list.head, prev = null;
 
        if (currNode != null && currNode.data == key) {
            list.head = currNode.next; 
            System.out.println(key + " found and deleted");
 
            return list;
        }
 
        while (currNode != null && currNode.data != key) {
            prev = currNode;
            currNode = currNode.next;
        }
        if (currNode != null) {
            prev.next = currNode.next;
 
            System.out.println(key + " found and deleted");
        }
        if (currNode == null) {
            System.out.println(key + " not found");
        }
        return list;
    }
 
    public static void main(String[] args)
    {
        ImplementLL list = new ImplementLL();
 
        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        printList(list);
        deleteByKey(list, 1);
 
        printList(list);
 
        deleteByKey(list, 4);
 
        printList(list);
        list = insert(list, 10);
        deleteByKey(list, 10);
        list = insert(list, 10);
        printList(list);
    }
}

