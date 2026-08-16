package Mathematics;
import java.util.Scanner;

public class SumOfN {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        SumOfNumbers(n);
        sc.close();
    }

    static void SumOfNumbers(int n)
    {
        // int ans = 0;
        // for(int i = 1; i <= n; i++)
        // {
        //     ans += i; 
        // }
        // System.out.println(ans);

        int ans = n * (n + 1) /2;
        System.out.println(ans);
    }
}
