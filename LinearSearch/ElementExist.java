package LinearSearch;

import java.util.Scanner;

public class ElementExist {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] letter = new char[n];
        for(int i = 0; i < n; i++)
        {
            letter[i] = sc.next().charAt(0);
        }
        char target = 'a';
        boolean isFound = Search(letter, target);
        System.out.println(isFound);
    }

    static boolean Search(char[] letter, char target)
    {
        if(letter.length == 0)
        {
            return false;
        }
        for(int i = 0; i < letter.length; i++)
        {
            if(target == letter[i])
            {
                return true;
            }
        }
        return false;
    }
}
