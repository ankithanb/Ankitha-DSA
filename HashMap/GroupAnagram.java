package HashMap;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class GroupAnagram {
    public static void main(String[] args)
    {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};

        System.out.println(GroupAnagrams(strs));
    }

    static List<List<String>> GroupAnagrams(String[] strs)
    {
        HashMap<String, List<String>> map = new HashMap<>();

        for(String str : strs)
        {
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);

            if(!map.containsKey(key))
            {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
