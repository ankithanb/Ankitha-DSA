package Mathematics;
import java.util.Scanner;

public class SumOfThreeDigits {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sum(n);
        sc.close();
    }

    static void sum(int n)
    {

        int ans = 0;
        while(n != 0)
        {
            int num = n % 10;
            ans += num;
            n /= 10;
        }
        // if(ans % 3 == 0)
        // {
        //     System.out.println("Lucky");
        // }
        // else{
        //     System.out.println("Not Lucky");
        // }

        System.out.println((ans % 3 == 0) ? "Lucky" : "Not Lucky" );
    }
}
