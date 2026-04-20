// this is a program to find smallest number after deleting k number of digit in the given string.
// Algorithm : 
// Traverse from left to right.
// for each character :
//      if stack is empty AND stack.peek() > ch , then pop top element and k--.
//      else push that character into that stack.
// if still k > 0, then pop the stack elements until k < 0.
// Add all the elements to the result from stack.
// while result have the 0 element at the index 0, then pop up that element ,, if the last element in the result is 0, then leave it as it is.
// return that result.

// Time Complexity : O(n).
// Space Complexity : O(n).


package Stack;

import java.util.Scanner;
import java.util.Stack;

public class RemoveKDigits {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int k = sc.nextInt();
        String Str = Remove(s,k);
        System.out.println(Str.toString());
        sc.close();
    }

    static String Remove(String s, int k)
    {
        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();

        for(char ch : s.toCharArray())
        {
            while(!stack.isEmpty() && k > 0 && stack.peek() > ch)
            {
                stack.pop();
                k--;
            }
            stack.push(ch);
        }

        while(k > 0)                // if still k > 0 then pop k number of elements from stack.
        {
            stack.pop();
            k--;
        }

        for(char ch : stack)       // stack elements adding to the result.
        {
            result.append(ch);
        }

        while(result.length() > 1 && result.charAt(0) == '0')       // remove 0 if in the 0th index, if 0 is only element in result, then leave it to print.
        {
            result.deleteCharAt(0);
        }
        
        return result.toString();
    }
}
