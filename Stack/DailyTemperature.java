// this is a program to find How many days to wait for a warmer temperature.

// Algorithm
// Traverse from right → left
// For each index i:
//      Remove all smaller or equal temperatures
//      If stack empty → 0
//      Else → stack.peek() - i
//      Push current index

// Time complexity is O(n) (for Stack) where traverse through each element in an given array.
// Space Complexity is O(n).


package Stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class DailyTemperature {
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

        for(int i = n - 1; i >= 0; i--)
        {
            while (!stack.isEmpty() && arr[stack.peek()] <= arr[i]) 
            {
                stack.pop();
            }
            if(stack.isEmpty())
            {
                res[i] = 0;
            }
            else{
                res[i] = stack.peek() - i;
            }
            stack.push(i);
        }
        return res;
    }
}
