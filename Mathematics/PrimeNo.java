package Mathematics;
import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        PrimeNumber(n);
        sc.close();
    }

    static void PrimeNumber(int n)
    {
        if(n <= 1)
        {
            System.out.println("No");
            return;
        }

        for(int i = 2; i*i <= n; i++)
        {
            if(n % i == 0)
            {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
