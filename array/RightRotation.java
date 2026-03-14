package Array;
import java.util.ArrayList;
public class rightRotation {
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5};
        int k = 2;
        ArrayList<Integer> List = new ArrayList<>();
        for(int i = k; i < arr.length; i++)
        {
            List.add(arr[i]);
        }
        for(int i = 0; i < k; i++)
        {
            List.add(arr[i]);
        }
        System.out.println(List);
    }
}
