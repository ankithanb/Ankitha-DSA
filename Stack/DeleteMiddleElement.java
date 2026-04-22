// this is a program to remove the middle element from the given stack using Recursion.
// find middle element.
// using recursion : 
//      pop elements one by one.
//      if k == mid -> skip element.
//      push all poped elememts.

// Time complexity : O(n).
// Space complexity : O(n).


package Stack;
import java.util.Stack;

public class DeleteMiddleElement {

    static void Delete(Stack<Integer> stack, int k)
    {
        if(k == 1)                                     // BAse Condition.
        {
            stack.pop();
            return;
        }
        int temp = stack.pop();
        Delete(stack, k -1);                          // Recursive Condition.
        stack.push(temp);                             // push back all poped elements.
    }
    public static void main(String[] args)
    {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        int k = stack.size() / 2 + 1;               // Find the middle element index.

        Delete(stack, k);

        System.out.println(stack);
    }
}
