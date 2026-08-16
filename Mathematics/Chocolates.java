package Mathematics;
import java.util.Scanner;

public class Chocolates {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = sc.nextInt();

        Choco(n, num);
        sc.close();
    }    

    static void Choco(int n, int num)
    {
        // int product = 0;
        // int i =1;
        // for(i = 1; i < n; i++)
        // {
        //     product = n * i; 
        //     if(product > num)
        //     {
        //         break;
        //     }
        // }
        // int Boxes = i - 1;
        // int Remaining = num - n * (i-1);

        // System.out.println("Boxes: " + Boxes +"\n"+ "Remaining : "+ Remaining);

        
        int Remaining = num % n;
        int Boxes = num / n;

        System.out.println("Boxes: " + Boxes +"\n"+ "Remaining : "+ Remaining);

    }
}
