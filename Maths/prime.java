package Maths;
public class prime {
    public static void main(String[] args)
    {
        int n = 11;
        if(n <= 1)
        {
            System.out.println("false");
            return;
        }
        for(int i = 2; i <= n / 2; i++)
        {
            if(n % i == 0)
            {
            System.out.println("false");
            return;
            }
        }
        System.out.println("true");
    }
}
