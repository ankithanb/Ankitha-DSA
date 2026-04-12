package BinarySearch;

import java.util.Scanner;

public class RotatedSortedArray {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(Search(arr, target));
    }

    static int Search(int[] arr, int target)
    {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end)
        {
            int mid = start + (end - start) / 2;
            if(arr.length == 0)
            {
                return -1;
            }
            if(target == arr[mid])                          // if the middle element is the target, then write it as output.
            {
                return mid;
            }

            if(arr[start] <= arr[mid])
            {
                if(target >= arr[start] && target < arr[mid])
                {
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
            else{
                if(target <= arr[end] && target > arr[mid] )
                {
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
