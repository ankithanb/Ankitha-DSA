package Mathematics;
import java.util.Scanner;

public class ReverseNo {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(Reverse(n));
        sc.close();
    }    

    static int Reverse(int n)
    { 
        int ans = 0;
        while(n != 0)
        {
            int num = n % 10;
            ans = ans *10 + num;
            n /= 10;
        }
        return ans;
    }
}
