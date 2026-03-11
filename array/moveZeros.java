package Array;

import java.util.ArrayList;
public class moveZeros {
    public static void main(String[] args)
    {
        int[] arr = {10,2,0,3,50,64,0,52,0,1};
        int count = 0;

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] != 0)
            {
                list.add(arr[i]);
            }
            else
            {
                count++; 
            }
        }
        for(int i = 0; i < count; i++)
        {
            list.add(0);
        }
        System.out.println(list);
    }
}
