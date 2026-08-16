package Mathematics;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        PalindromeNumber(n);
        sc.close();
    }    

    static void PalindromeNumber(int n)
    {
        int m = n;
        int ans = 0;

        while(n != 0)
        {
            int num = n % 10;
            ans = ans * 10 + num;
            n /= 10;
        }
        
        System.out.println((ans == m) ? "Yes" : "No");
    }
}
