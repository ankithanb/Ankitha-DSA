// this is a program to find the minimum element in the given array.
// time complexity is O(log n) for Binary search.

package BinarySearch;
import java.util.Scanner;

public class MinimumElement {
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
        sc.close();
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
            if(arr[mid] > arr[mid + 1])
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
