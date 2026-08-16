package Mathematics;
import java.util.Scanner;

public class EvenNoOfEvenDigits {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Even(n);
        sc.close();
    }

    static void Even(int n)
    {
        int count = 0;
        while(n != 0)
        {
            int digit = n % 10;
            if(digit % 2 == 0)
            {
                count++;
            }
            n /= 10;
        }

        System.out.println((count % 2 == 0) ? "ON" : "OFF");
    }
}
