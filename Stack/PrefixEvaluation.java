// this is a program to find the postfix evaluation result.
// Algorithm :
// Traverse from right to left because it is a prefix evaluation.
// for each character in the given String :
//      if that character is a digit , then push into the stack.
//      esle pop two elements(first 'a' item and next 'b' item) from stack and apply that character between them.
// at last print the element in the stack.

// Time Complexity : O(n).
// Space Complexity : O(n).


package Stack;

import java.util.Scanner;
import java.util.Stack;

public class PrefixEvaluation {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String exp = sc.nextLine();

        int result = Prefix(exp);
        System.out.print(result);
        sc.close();
    }

    static int Prefix(String exp)
    {
        Stack<Integer> stack = new Stack<>();
        for(int i = exp.length() - 1; i >= 0 ; i--)
        {
            char ch = exp.charAt(i);

            if(ch == ' ') continue;

            if(Character.isDigit(ch))
            {
                stack.push(ch - '0');
            }
            else{
                int a = stack.pop();
                int b = stack.pop();

                if(ch == '+') 
                    stack.push(a + b);
                else if(ch == '-')
                    stack.push(a - b);
                else if(ch == '*')
                    stack.push(a * b);
                else if(ch == '/')
                    stack.push(a / b);
            }
        }
        return stack.pop();
    }
}
