// this is a program to find the next greater element of the current element.
// time complexity is o(n) where traversing each element in an given array and all operations in the stack will take only O(1) means Constant time.
// Space complexity is O(n).

// Algorithm
// first, we have to move from right to left.
// next, we have to check whether the stack is empty or not and stack.peek() element is <= arr[i],, if both conditions are true, then pop the stack element.
// next, if stack is empty, then assign -1.
// else if stack is not empty, then assign stack.peek() element.
// and push the arr[i] element into the stack.


package Stack;

import java.util.Scanner;
import java.util.Stack;
import java.util.Arrays;
public class NxtGreaterElement {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        int[] res = Find(arr);
        System.out.println(Arrays.toString(res));
        sc.close();
    }

    static int[] Find(int[] arr)
    {
        int[] res = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        int n = arr.length;

        for(int i = n - 1; i >= 0; i--)
        {
            while(!stack.isEmpty() && stack.peek() <= arr[i])
            {
                stack.pop();
            }
            if(stack.isEmpty())
            {
                res[i] = -1;
            }
            else{
                res[i] = stack.peek();
            }
            stack.push(arr[i]);
        }
        return res;
    }
}
