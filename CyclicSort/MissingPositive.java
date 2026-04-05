//Asked in product companies.

package CyclicSort;
import java.util.Scanner;
public class MissingPositive {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println(Positive(arr));
        sc.close();
    }

    static int Positive(int[] arr)
    {
        int i = 0;
        while(i < arr.length)
        {
            int correct = arr[i] - 1;
            if(arr[i] < arr.length && arr[i] > 0 && arr[i] != arr[correct])
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
                return index+1;
            }
        }
        return arr.length + 1;
    }

    static void swap(int[] arr, int f, int s)
    {
        int temp = arr[f];
        arr[f] = arr[s];
        arr[s] = temp;
    }
}
