// this is a program for finding the target element in an given array.
// and that array should be in ascending order for this code. write the code for descending order.
// Time complexity is O(log n) Logerthemic for binary search.


package BinarySearch;
import java.util.Scanner;

public class TargetElement {
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
        System.out.println(Binary(arr,target));
    }

    static int Binary(int[] arr, int target)
    {
        int start = 0;
        int end = arr.length - 1;

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
        return -1;
    }
}

