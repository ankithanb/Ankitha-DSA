package HashMap;
import java.util.HashMap;
public class RemoveDuplicate {
    public static void main(String[] args)
    {
        int[] arr = {7,8,9,7,8,10,11};

        HashMap<Integer, Boolean> map = new HashMap<>();

        // for(int num : arr)
        // {
        //     map.put(num, map.getOrDefault(num, 0) + 1);
        // }

        // for(int num : arr)
        // {
        //     if(map.get(num) != 1)
        //     {
        //         map.put(num, map.get(num) - 1);
        //     }
        // }

        // for(int num : map.keySet())
        // {
        //     System.out.print(num+" ");
        // }

        for(int num : arr)
        {
            if(!map.containsKey(num))
            {
                map.put(num, true);
                System.out.print(num+" ");
            }

        }
    }
}
