package BinarySearch;

import java.util.Scanner;

public class PeakElement {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(Search(arr));
    }

    static int Search(int[] arr)
    {
        if(arr.length == 0)
        {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;

        while(start < end)
        {
            int mid = start + (end - start) / 2;
            if(arr[mid] < arr[mid + 1])
            {
                start = mid + 1;
            }
            else{
                end = mid;
            }
        }
        return start;
    }
}
