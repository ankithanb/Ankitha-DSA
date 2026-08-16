package Mathematics;
import java.util.Scanner;

public class ProductAndSum {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ProductSum(n);
        sc.close();
    }

    static void ProductSum(int n)
    {
        int sum = 0;
        int product = 1;

        while(n != 0)
        {
            int num = n % 10;
            sum += num;
            product *= num;
            n /= 10;
        }
        System.out.println((product > sum) ? "Healthy" : "Not Healty");
    }
}
