// Time complexity : O(n)
// Space complexity : O(k)


package HashMap;
import java.util.HashMap;

public class FindDuplicate {
    public static void main(String[] args)
    {
        int[] arr = {7,8,6,5,9};

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : arr)
        {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        boolean found = false;
        for(int num : map.keySet())
        {
            if(map.get(num) > 1)
            {
                System.out.println(num);
                found = true;
            }
        }

        if(!found)
        {
            System.out.println("No duplicate numbers...");
        }
    }
}
