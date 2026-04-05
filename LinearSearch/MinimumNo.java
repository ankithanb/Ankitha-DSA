package LinearSearch;

import java.util.Scanner;

public class MinimumNo {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(Minimum(arr));
        sc.close();
    }

    static int Minimum(int[] arr)
    {
        int min = arr[0];
        for(int i = 0; i< arr.length; i++)
        {
            if(arr[i] < min)
                min = arr[i];
        }
        return min;
    }
}
