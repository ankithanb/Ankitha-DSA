package LinearSearch;

import java.util.Scanner;

public class FindTarget {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int start = sc.nextInt();
        int end = sc.nextInt();
        int target = sc.nextInt();

        int result = Target(arr,start,end, target);
        System.out.println(result);
        sc.close();
    }

    static int Target(int[] arr, int start, int end, int target)
    {
        for(int i = start; i <= end; i++)
        {
            if(arr[i] == target)
            {
                return i;
            }
        }
        return -1;
    }
}
