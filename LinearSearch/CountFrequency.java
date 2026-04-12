package LinearSearch;

import java.util.Scanner;

public class CountFrequency {
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

        int res = Search(arr,target);
        System.out.println(res);
        sc.close();
    }

    static int Search(int[] arr, int target)
    {
        if(arr.length == 0)
        {
            return -1;
        }
        
        int count = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == target)
            {
                count++;
            }
        }
        return count;
    }
}
