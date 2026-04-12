// this is a program to find the last occurrence of the target element.
// time complexity is O(log n) Logerthemic for binary search.


package BinarySearch;
import java.util.Scanner;

public class LastOccurrence {
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
        int end = Search(arr, target, false);             // this is the main thing in this program.

        System.out.println(end);
    }

    static int Search(int[] arr, int target, boolean LastOccurre)
    {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        if(arr.length == 0)                                             // if array is empty, then print -1.
        {
            return  -1;
        }

        while(start <= end)
        {
            int mid = start + (end-start) / 2;
            if(target > arr[mid])
            {
                start = mid + 1;
            }
            else if(target < arr[mid]){
                end = mid - 1;
            }
            else{
                ans = mid;
                if(LastOccurre)
                {
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
            
        }
        return ans;
    }
}
