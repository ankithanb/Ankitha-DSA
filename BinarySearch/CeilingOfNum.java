// this is a program to print the ceiling of a number.
// that means, print the number of the index of smallest element >= target.
// time complexity is O(log n) Logerthemic for Binary search.


package BinarySearch;

import java.util.Scanner;

public class CeilingOfNum {
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

        if(target > arr[arr.length - 1])            // if target element is greater than the last element,then -1.
        {
            return -1;
        }

        while(start <= end)
        {
            int mid = start + (end-start) / 2;
            if(target < arr[mid])
            {
                end = mid - 1;
            }
            else if(target > arr[mid])
            {
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return arr[start];                        
    }
}
