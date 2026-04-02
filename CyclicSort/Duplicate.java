// When they ask to print the duplicate numbers then we have to use Cyclic Sort instead of brute force code ,, 
// because time complexity will be reduse.

package CyclicSort;

import java.util.Scanner;

public class Duplicate {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println(duplicate(arr));
    }

    static int duplicate(int[] arr)
    {
        int i = 0;
        while(i < arr.length)
        {
            if(arr[i] != i+1)
            {
                int correct = arr[i] - 1;
                if(arr[i] != arr[correct])
                {
                    swap(arr, i, correct);
                }
                else{
                    return arr[i];
                }
            }
            else{
                i++;
            }
        }
        return -1;
    }

    static void swap(int[] arr, int f, int s)
    {
        int temp = arr[f];
        arr[f] = arr[s];
        arr[s] = temp;
    }
}
