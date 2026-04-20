// this is a program to reverse a given stack.
// Algorithm : 
// Reverse function
//      If stack is empty → return
//      Pop top element
//      Recursively reverse remaining stack
//      Insert popped element at bottom

// Insert at bottom
//      If stack empty → push element
//      Else:
//          Pop top
//          Recursively insert
//          Push back popped element

// Time complexity : O(n²).
// Space Complexity : O(n).

package Stack;

import java.util.Stack;
public class ReverseStack {

    static void InsertAtBottom(Stack<Integer> stack, int x)
    {
        if(stack.isEmpty())
        {
            stack.push(x);
            return;
        }
        int top = stack.pop();
        InsertAtBottom(stack, x);
        stack.push(top);
    }
    static void Reverse(Stack<Integer> stack)
    {
        if(stack.isEmpty())
        {
            return;
        }
        int top = stack.pop();
        Reverse(stack);
        InsertAtBottom(stack,top);
    }

    public static void main(String[] args)
    {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        Reverse(stack);

        System.out.println(stack);

    }
}
