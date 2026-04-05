package CyclicSort;

import java.util.Scanner;
import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(Mismatch(arr)));
        sc.close();
    }

    static int[] Mismatch(int[] arr)
    {
        int i = 0; 
        while(i < arr.length)
        {
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct])
            {
                swap(arr, i, correct);
            }
            else{
                i++;
            }
        }
        for(int index = 0; index < arr.length; index++)
        {
            if(arr[index] != index + 1)
            {
                return new int[] {arr[index] , index+1};
            }
        }
        return new int[] {-1,-1};
    }
    
    static void swap(int[] arr, int f, int s)
    {
        int temp = arr[f];
        arr[f] = arr[s];
        arr[s] = temp;
    }
}
