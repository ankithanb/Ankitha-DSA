package CyclicSort;

import java.util.Scanner;
import java.util.ArrayList;

public class DisappearNo {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        // ArrayList<Integer> result = notVisible(arr);
        // System.out.println(result);
        // OR

        System.out.println(notVisible(arr));
    }

    static ArrayList<Integer> notVisible(int[] arr)
    {
        int i = 0; 
        ArrayList<Integer> List = new ArrayList<>();
        while(i < arr.length)
        {
            int correct = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[correct])
            {
                swap(arr, i, correct);
            }
            else{
                i++;
            }
        }
        for(int index = 0; index < arr.length; index++)
        {
            if(arr[index] != index)
            {
                List.add(index);
            }
        }
        return List;
    }

    static void swap(int[] arr, int f, int s)
    {
        int temp = arr[f];
        arr[f] = arr[s];
        arr[s] = temp;
    }
}
