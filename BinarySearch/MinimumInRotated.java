package BinarySearch;

import java.util.Scanner;

public class MinimumInRotated {
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
    }

    static int Minimum(int[] arr)
    {
        int start = 0;
        int end = arr.length - 1;
        while(start < end)
        {
            int mid = start + (end-start) / 2;
            if(arr[mid] > arr[end])
            {
                start = mid + 1;
            }
            else{
                end = mid;
            }
        }
        return arr[start];
    }
}
