// this is a program to print "How many previous elements are smaller or equal including itself?"

// Algorithm : 
// For each index i:
// 1. Remove all previous elements ≤ current
// 2. If stack empty → span = i + 1
// 3. Else → span = i - stack.peek()
// 4. Push current index.

// time complexity is O(n) for traversing each element in the given array.
// space complexity is O(n).

package Stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class StockSpanPrb {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        int[] res = Search(arr);
        System.out.println(Arrays.toString(res));
        sc.close();
    }

    static int[] Search(int[] arr)
    {
        int n = arr.length; 
        int[] res = new int[n];
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < n; i++)
        {
            while(!stack.isEmpty() && arr[stack.peek()] <= arr[i])
            {
                stack.pop();
            }
            if(stack.isEmpty())
            {
                res[i] = i + 1;
            }
            else{
                res[i] = i - stack.peek();
            }
            stack.push(i);
        }
        return res;
    }
}
