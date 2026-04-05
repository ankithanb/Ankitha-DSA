// this is a program to print the Floor of a number.
// that means, print the number of the index of greater element <= target.
// time complexity is O(log n) Logerthemic for Binary search.


package BinarySearch;

import java.util.Scanner;

public class FloorOfNum {
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

        if(target > arr[arr.length - 1])                // if target element is greater than the last element,then -1.
        {
            return -1;
        }

        while(start <= end)
        {
            int mid = start + (end-start) / 2;
            if(target > arr[mid])
            {
                start = mid + 1;
            }
            else if(target < arr[mid])
            {
                end = mid - 1;
            }
            else{
                return -1;
            }
        }
        return end;
    }
}
