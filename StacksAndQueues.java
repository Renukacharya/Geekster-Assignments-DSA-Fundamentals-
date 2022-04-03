package dsaMarch2022;
import java.util.*;
public class StacksAndQueues {
//	"1. Create a myStack Class which has the following methods:
//    1. Push(x) : inserts the data into the stack 
//    2. Pop(): Removes the top element.
//    3. Peek() : Displays the top element.
//2. https://leetcode.com/problems/valid-parentheses/
//3. Remove adjacent chars in a string.
//4. Reverse only words in a string using stacks.
//5. Using 2 stacks implement a queue.
//6. Using 2 queue implement a stack."
		
	
	static void push(Stack<Integer> stack)
    {
        for(int i = 0; i < 5; i++)
        {
            stack.push(i);
        }
    }
     
    static void pop(Stack<Integer> stack)
    {
        System.out.println("Pop Operation:");
 
        for(int i = 0; i < 5; i++)
        {
            Integer y = (Integer) stack.pop();
            System.out.println(y);
        }
    }
 
    static void peek(Stack<Integer> stack)
    {
        Integer element = (Integer) stack.peek();
        System.out.println("Element on stack top: " + element);
    }
     
    // Searching element in the stack
    static void search(Stack<Integer> stack, int element)
    {
        Integer pos = (Integer) stack.search(element);
 
        if(pos == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element is found at position: " + pos);
    }
 
    
    
    
 
    public static void main (String[] args)
    {
        Stack<Integer> stack = new Stack<Integer>();
 
        push(stack);
        pop(stack);
        push(stack);
        peek(stack);
        search(stack, 2);
        search(stack, 6);
    }
}

