// this is a program to find the postfix evaluation result.
// Algorithm :
// Traverse from left to right because it is a postfix evaluation.
// for each character in the given String :
//      if that character is a digit , then push into the stack.
//      esle pop two elements(first 'b' item and next 'a' item) from stack and apply that character between them.
// at last print the element in the stack.

// Time Complexity : O(n).
// Space Complexity : O(n).


package Stack;

import java.util.Scanner;
import java.util.Stack;

public class PostfixEvaluation {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String exp = sc.nextLine();

        int result = Postfix(exp);
        System.out.print(result);
        sc.close();
    }

    static int Postfix(String exp)
    {
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < exp.length(); i++)
        {
            char ch = exp.charAt(i);

            if(ch == ' ') continue;

            if(Character.isDigit(ch))
            {
                stack.push(ch - '0');
            }
            else{
                int b = stack.pop();
                int a = stack.pop();

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
