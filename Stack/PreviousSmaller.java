// this is a program to find the Previous Smaller Element.

// Algorithm
// travers from right to left.
// for each element : 
//      Remove elements which are greater than the current element in the stack.
//      if the stack is empty, then push -1.
//      else push the stack.peek() element.
//      push the current element into stack.

// Time complexity is O(n) (for Stack) where traverse through each element in an given array.
// Space Complexity is O(n).

package Stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class PreviousSmaller {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int[] res = Find(arr);
        System.out.println(Arrays.toString(res));
        sc.close();
    }

    static int[] Find(int[] arr)
    {
        int n = arr.length;
        int[] res = new int[n];
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < n; i++)
        {
            while(!stack.isEmpty() && stack.peek() >= arr[i])
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
