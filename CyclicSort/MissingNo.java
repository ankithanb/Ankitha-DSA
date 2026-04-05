package CyclicSort;
import java.util.*;

public class MissingNo {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        ArrayList<Integer> result = Missing(arr);
        System.out.println(result);
    }

    static ArrayList<Integer>  Missing(int[] arr)
    {
        int i = 0; 
        ArrayList<Integer> List = new ArrayList<>();
        while(i < arr.length)
        {
            int correct = arr[i]-1;
            if(arr[i] <= arr.length && arr[i] != arr[correct])
            {
                swap(arr, i, correct);
            }
            else{
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
        for(int index = 0; index < arr.length; index++)
        {
            if(arr[index] != index + 1)
            {
                List.add(index + 1);
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