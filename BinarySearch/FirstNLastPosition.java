// this is a program to find the first and last position of the target element.
// Time complexity is O(log n) Logerthemic for binary search.

package BinarySearch;

import java.util.Scanner;
import java.util.Arrays;

public class FirstNLastPosition {
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

        int[] ans = {-1,-1};                                    // in the first, we have to assign the start and end index as -1.
        int start = Position(arr, target, true);     // this will find the start index of the target element.
        int end = Position(arr, target, false);      // this will find the last index of the target element.

        ans[0] = start;                                        // when we found the start index of the target , we have assign it in ans[0].
        ans[1] = end;                                          // when we found the last index of the target , we have assign it in ans[1].
        
        System.out.println(Arrays.toString(ans));
    }

    static int Position(int[] arr, int target, boolean findIndex)
    {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;

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
                ans = mid;                                  // if the ans is mid, then dont stop. because previous and next that ans have target element so.
                if(findIndex)                               // when we find the starting index of the target, we have to check before the mid.
                {
                    end = mid - 1;
                }
                else{                                       // when we find the ending index of the target, we have to check afters the mid.
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
