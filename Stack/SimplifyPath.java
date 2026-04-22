// this is a program to simplify the url path.
// Algorithm :
// Split that path into Arrays of String.
// Traver from left to right.
// for each character:
//       if string is a "" || ".", then continue.
//       else if string is a "..", then if string is not empty then, pop string.
//       else push into the stack.
// create a StringBuilder variable.
// for each string in the stack, before that each string we have to add "/".
// return result.

// Time Complexity : O(n).
// Space Complexity : O(n).


package Stack;

import java.util.Scanner;
import java.util.Stack;

public class SimplifyPath {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String result = Simplify(str);
        System.out.println(result);
        sc.close();
    }
    
    static String Simplify(String path)
    {
        Stack<String> stack = new Stack<>();
        String[] parts = path.split("/");

        for(String ch : parts)
        {
            if(ch.equals("") || ch.equals("."))
                continue;

            else if(ch.equals(".."))
            {
                if(!stack.isEmpty())
                    stack.pop();
            }
            else{
                stack.push(ch);
            }
        }
        StringBuilder result = new StringBuilder();
        for(String str : stack)
        {
            result.append('/').append(str);
        }

        return result.length() == 0 ? "/" : result.toString();
    }
}
