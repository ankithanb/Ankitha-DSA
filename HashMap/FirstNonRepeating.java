// Time complexity : O(n)
// Space complexity : O(k)

package HashMap;
import java.util.HashMap;
public class FirstNonRepeating {
    public static void main(String[] args)
    {
        String str = "apple";

        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : str.toCharArray())
        {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        System.out.println(map);

        for(char ch : map.keySet())
        {
            if(map.get(ch) == 1)
            {
                System.out.println(ch);
                return;
            }
        }

        System.out.println(-1);
    }
}
