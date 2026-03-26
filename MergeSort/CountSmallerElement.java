import java.util.ArrayList;
import java.util.Arrays;

public class CountSmallerElement {
    public static void main(String[] args)
    {
        int[] arr = {5,2,6,1};
        int[] result = Count(arr);
        System.out.println(Arrays.toString(result));
    }

    static int[] Count(int[] arr)
    {
        ArrayList<Integer> List = new ArrayList<>();
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = i+1; j < arr.length; j++)
            {
                if(arr[i] > arr[j])
                {
                    List.add(arr[j]);
                    break;
                }
            }
        }
        if(arr[arr.length - 1] == 1)
            List.add(0);
        
        int[] result = new int[List.size()];
        for(int i = 0; i < List.size(); i++)
        {
            result[i] = List.get(i);
        }
        return result;
    }
}
