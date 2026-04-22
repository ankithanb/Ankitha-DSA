package Stack;

import java.util.Stack;

public class SortStackRecursively {
    static void Insert(Stack<Integer> stack, int x)
    {
        if(stack.isEmpty() || stack.peek() <= x)
        {
            stack.push(x);
            return;
        }

        int top = stack.pop();
        Insert(stack, x);
        stack.push(top);
    }
    
    static void Sort(Stack<Integer> stack)
    {
        if(stack.isEmpty())
            return;

        int temp = stack.pop();
        Sort(stack);
        Insert(stack, temp);
    }



    public static void main(String[] args)
    {
        Stack<Integer> stack = new Stack<>();

        stack.push(40);
        stack.push(20);
        stack.push(10);
        stack.push(30);
    
        Sort(stack);

        System.out.println(stack);
    }
}
