// this is a program to find the target element in given an array.
// when we dont know whether the array is in ascending or descending ,, in that time we have to write this code.
// so it is called OrderAgnostic Binary search.
// Time complexity os O(log n) Logerthemic for Binary search.


package BinarySearch;

import java.util.Scanner;

public class OrderAgnostic {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++)
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

        boolean IsAscending = arr[start] <= arr[end];

        while(start <= end)
        {
            int mid = start + (end-start)/2;
            if(arr[mid] == target)
            {
                return mid;
            }
            if(IsAscending)                     // if array is in ascending , then go through this if condition.
            {
                if(target > arr[mid])
                {
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
            else{                             // if array is in descending , then go through this else condition.
                if(target < arr[mid])
                {
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
        }
        return  -1;
    }
}
