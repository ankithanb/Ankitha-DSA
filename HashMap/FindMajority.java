package HashMap;
import java.util.HashMap;
public class FindMajority {
    public static void main(String[] args)
    {
        int[] arr = {2,2,4,5,3,2,2};
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : arr)
        {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        boolean found = false;
        
        for(int num : arr)
        {
            if(map.get(num) > arr.length / 2)
            {
                System.out.println(num);
                found = true;
                break;
            }
        }
        
        if(!found)
        {
            System.out.println("No element found");
        }
    }
}
