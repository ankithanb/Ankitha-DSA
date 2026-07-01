package HashMap;
import java.util.HashMap;

public class Frequency {
    public static void main(String[] args){
        int[] arr = {1,2,2,2,4,3,5,1,3};

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : arr)
        {
            if(map.containsKey(num))                    // check whether the map contains the num or not.
            {
                map.put(num, map.get(num) + 1);         // map.get() will give the value of that particular key.
            }
            else{
                map.put(num, 1);                 // if not contains then, assign 1 to that key.
            }
        }
        System.out.println(map);
    }
}
