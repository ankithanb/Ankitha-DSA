package Array;
import java.util.*;
import java.util.ArrayList;
public class duplicates {
    public static void main(String[] args)
    {
        int[] arr = {1,2,5,4,6,2,6,8,9,8,3,5};
        System.out.println(Duplicate(arr));
    }

    static ArrayList<Integer> Duplicate(int[] arr)
    {
        int i = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while(i < arr.length)
        {
            int correct = arr[i] - 1;
            if(arr[i] < arr.length && arr[i] != arr[correct])
            {
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
        for(int index = 0; index < arr.length; index++)
        {
            if(arr[index] != index+1)
            {
                list.add(arr[index]);
            }
        }
        Collections.sort(list);
        System.out.println(Collections.min(list));
        return list;
    }
    static void swap(int[] arr , int f, int s)
    {
        int temp = arr[f];
        arr[f] = arr[s];
        arr[s] = temp;
    }
}
