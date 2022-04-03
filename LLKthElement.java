package linkedList;

public class LLKthElement {
//	"1. Find the kth element in a linked list from the end of singlly linked list in :
//	   1. Using two traversal 
//	   2. In single traversal (using 2 pointer approch).
//	https://leetcode.com/problems/intersection-of-two-linked-lists/
//	https://leetcode.com/problems/remove-duplicates-from-sorted-list/
//	https://leetcode.com/problems/merge-two-sorted-lists/ "
	
	static Node head; 
	 
    static class Node {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
    static void printNthFromLast(int n)
    {
        int len = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            len++;
        }
 
        if (len < n)
            return;
 
        temp = head;
        for (int i = 1; i < len - n + 1; i++)
            temp = temp.next;
 
        System.out.println(temp.data);
    }
    public static void push(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
 
        head = new_node;
    }
    public static void main(String[] args)
    {
        push(20);
        push(4);
        push(15);
        push(35);
 
        printNthFromLast(4);
    }
}
