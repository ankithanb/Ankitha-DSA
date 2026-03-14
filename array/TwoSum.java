package Array;
import java.util.ArrayList;
public class TwoSum {
    public static void main(String[] args)
    {
        int[] arr = {2,7,11,15};
        int target = 9;
        ArrayList<Integer> List = new ArrayList<>();
         
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = i+1; j < arr.length; j++)
            {
                if(arr[i] + arr[j] == target)
                {
                    List.add(i);
                    List.add(j);  
                    break;
                }
            }
        }
        System.out.println(List);
    }
}
