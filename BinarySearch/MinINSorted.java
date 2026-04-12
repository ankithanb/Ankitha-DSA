package BinarySearch;

import java.util.Scanner;

public class MinINSorted {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(Search(arr));
        sc.close();
    }

    static int Search(int[] nums)
    {
        if(nums.length == 0)
        {
            return -1;
        }

        int start = 0;
        int end = nums.length - 1;

        while(start < end)
        {
            int mid = start + (end - start) / 2;
            if(nums[mid] > nums[end])
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
