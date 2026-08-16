package Mathematics;
import java.util.Scanner;
import java.util.ArrayList;

class GCD {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        GCDofNo(num1, num2);
        sc.close();
    }
    
    static void GCDofNo(int num1, int num2)
    {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();

        for(int i = num1; i >= 1; i--)
        {
            if(num1 % i == 0)
            {
                list.add(i);
            }
        }
        for(int i = num2; i >= 1; i--)
        {
            if(num2 % i == 0)
            {
                list1.add(i);
            }
        }

        int max = Integer.MIN_VALUE;
        System.out.println(list.get(1));
        if(list.size() > list1.size())
        {
            for(int i = list.size()-1; i > 0; i--)
            {
                if(list.get(i) == list1.get(i))
                {
                    if(list.get(i) > max)
                    {
                        max = list.get(i);
                    }
                }
            }
        }
        System.out.println(max);
    }
}
