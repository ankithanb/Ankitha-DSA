// this is a program to insert element at bottom of the stack.
// Algorithm :
// if stack is empty, then insert that x value.
// or else pop out all elements from that stack and it becomes empty.
// after stack empty, push that x value and push all pop out elements into that stack.

// Time complexity : O(n).
// Space complexity : O(n).



package Stack;

import java.util.Stack;

public class InsertElementAtBottom {
    
    static void Insert(Stack<Integer> stack, int x)
    {
        if(stack.isEmpty())                             // if stack is empty then, push x into the stack.
        {
            stack.push(x);
            return;
        }

        int temp = stack.pop();                        // pop out all elements from that stack. 
        Insert(stack, x);                               
        stack.push(temp);                              // after that base case means inserting that x value, push back all pop out elements.
    }

    public static void main(String[] args)
    {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        int x = 60;
        Insert(stack, x);

        System.out.println(stack);
    }
}
