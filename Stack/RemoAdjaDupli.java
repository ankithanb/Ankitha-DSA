// this is a program to remove the adjacent duplicates.
// Algorithm : 
// Traverse from left to right.
// for each character in given string:
//      if (!stack.isEmpty() && stack.peek() == ch), then pop.
//      else push
// convey each character in the stack to StringBuilder variable.
// return that result.

// Time Complexity : O(n).
// Space Complexity : O(n).


package Stack;

import java.util.Scanner;
import java.util.Stack;

public class RemoAdjaDupli {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String result = Remove(str);
        System.out.println(result);
        sc.close();
    }

    static String Remove(String str)
    {
        Stack<Character> stack = new Stack<>();
        for(char ch : str.toCharArray())
        {
            if(!stack.isEmpty() && stack.peek() == ch)
            {
                stack.pop();
            }
            else{
                stack.push(ch);
            }
        }

        StringBuilder result = new StringBuilder();
        for(char ch : stack)
        {
            result.append(ch);
        }

        return result.toString();
    }
}
