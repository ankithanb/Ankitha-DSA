// this is a program to find whether the given string paranthesis is valid or not.
// time complexity is O(n) where the traversing the string once and all operations of the stack takes O(n) that means Constant time.
// Space complexity is O(n) in the worst case when all characters are opening brackets.


package Stack;

import java.util.Scanner;
import java.util.Stack;

public class validParenthesis {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        boolean IsValid = Find(s);
        System.out.println(IsValid);
        sc.close();
    }

    static boolean Find(String s)
    {
        Stack<Character> stack = new Stack<>();         // creating one new stack.
        for(char ch : s.toCharArray())
        {
            if(ch == '(' || ch == '{' || ch == '[')
            {
                stack.push(ch);                         // inserting the character into the stack.
            }
            else{
                if(stack.isEmpty())                     // if that stack is empty, then return false.
                    return false;

                char top = stack.pop();                 // Taking the top character as top. 
                if(ch == ')' && top != '(') return false;
                if(ch == '}' && top != '{') return false;
                if(ch == ']' && top != '[') return false;
            }
        }
        return stack.isEmpty();                         // check whether the stack is empty or not.
    }
}
