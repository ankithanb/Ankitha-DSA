package Array;
import java.util.Arrays;
import java.util.ArrayList;
public class moveZeros {
    public static void main(String[] args)
    {
        // int[] arr = {10,2,0,3,50,64,0,52,0,1};
        // int count = 0;

        // ArrayList<Integer> list = new ArrayList<>();

        // for(int i = 0; i < arr.length; i++)
        // {
        //     if(arr[i] != 0)
        //     {
        //         list.add(arr[i]);
        //     }
        //     else
        //     {
        //         count++; 
        //     }
        // }
        // for(int i = 0; i < count; i++)
        // {
        //     list.add(0);
        // }
        // System.out.println(list);


        int[] nums = {10,2,0,3,50,64,0,52,0,1};
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] == 0)
            {
                count++;
            }
            else{
                list.add(nums[i]);
            }
        }
        for(int i = 0; i < count; i++)
        {
            list.add(0);
        }
        //System.out.println(list);

        // for(int i = 0; i < nums.length; i++)
        // {
        //     System.out.print(list.get(i)+" ");
        // }

        for(int i = 0; i < nums.length; i++)
        {
            nums[i] = list.get(i);
        }
        System.out.println(Arrays.toString(nums));
    }
}
