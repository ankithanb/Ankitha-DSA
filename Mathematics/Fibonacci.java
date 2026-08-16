package Mathematics;
import java.util.Scanner;

class Fibonacci {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(fibonacci(n));
        sc.close();
    }

    static int fibonacci(int n)
    {
        if(n == 1 || n == 2)
            return 1;

        int num1 = 1;
        int num2 = 1;
        // System.out.println(num1);
        //System.out.println(num2);
        int num3 = 0;

        for(int i = 3; i <= n; i++)
        {
            num3 = num1 + num2;
            //System.out.println(num3);
            num1 = num2;
            num2 = num3;
        }
        return num3;
    }
}