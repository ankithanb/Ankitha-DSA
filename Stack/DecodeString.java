// this is a program to convert encode string into decode string by using monotonic stack.
// Algorithm :
// Traverse a string from left to right.
// for each string:
// if that character is a digit , then num = num * 10 +(ch - 0).
// else if it is a '[', then  
//      push that num into numStack.
//      push that current into strStack.
//      assign num = 0.
//      assign current = " ".
// esle if it is a ']', then
//      pop that numStack into repeat.
//      pop that strStack into prev.
//      create one StringBuilder variable and pass into prev.
//      we have repeat that current element repeat of times and store into temp.
//      assign that temp into current.
// print that current string.

// Time Complexity : O(n * k) (k times repeatations).
// Space Complexity : O(n).


package Stack;

import java.util.Scanner;
import java.util.Stack;

public class DecodeString {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String str = Decode(s);
        System.out.println(str);
        sc.close();
    }

    static String Decode(String s)
    {
        Stack<Integer> numStack = new Stack<>();
        Stack<String> strStack = new Stack<>();

        int num = 0;
        String current = "";
        
        for(char ch : s.toCharArray())
        {
            if(Character.isDigit(ch))
            {
                num = num * 10 + (ch - '0');
            }
            else if(ch == '[')
            {
                numStack.push(num);
                strStack.push(current);

                num = 0;
                current = "";
            }
            else if(ch == ']')
            {
                int repeat = numStack.pop();
                String prev = strStack.pop();

                StringBuilder temp = new StringBuilder(prev);

                for(int i = 0; i < repeat; i++)
                {
                    temp.append(current);
                }
                current = temp.toString();
            }
            else{
                current += ch;
            }
        }
        return current;
    }
}
