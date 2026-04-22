// this is a program to find given both strings are equal or not after removing means when # come delete previous character.
// Algorithm :
// Traverse from left to right.
// for each character:
//      if character '#', then pop from stack.
//      else push into stack.
// compare both strings, if equals, then true. else false.

// Time complexity : O(n + m).
// Space complexity : O(n + m).


// package Stack;

// import java.util.Scanner;
// import java.util.Stack;
// public class BackSpaceStringCompare {
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
//         String s = sc.nextLine();
//         String t = sc.nextLine();

//         boolean result = BackSpace(s, t);
//         System.out.println(result);
//         sc.close();
//     }

//     static boolean BackSpace(String s, String t)
//     {
//         Stack<Character> stack1 = new Stack<>();
//         Stack<Character> stack2 = new Stack<>();

//         for(char ch : s.toCharArray())
//         {
//             if(ch != '#')
//                 stack1.push(ch);
//             else{
//                 if(!stack1.isEmpty())
//                 {
//                     stack1.pop();
//                 }
//             }
//         }

//         for(char ch : t.toCharArray())
//         {
//             if(ch != '#')
//                 stack2.push(ch);
//             else{
//                 if(!stack2.isEmpty())
//                 {
//                     stack2.pop();
//                 }
//             }
//         }

//         return (stack1.equals(stack2)) ? true : false;
//     }
// }


package Stack;

import java.util.Scanner;
import java.util.Stack;
public class BackSpaceStringCompare {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();

        boolean result = BackSpaceString(s, t);
        System.out.println(result);
        sc.close();
    }

    static boolean BackSpaceString(String s, String t) {
        return build(s).equals(build(t));
    }
    
    static String build(String str)
    {
        Stack<Character> stack = new Stack<>();
        for(char ch : str.toCharArray())
        {
            if(ch != '#')
                stack.push(ch);
            else{
                if(!stack.isEmpty())
                {
                    stack.pop();
                }
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