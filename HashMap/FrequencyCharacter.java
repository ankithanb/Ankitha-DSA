package HashMap;
import java.util.HashMap;

public class FrequencyCharacter {
    public static void main(String[] args)
    {
        String str = "apple";

        //LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();            // if we use linkedHashMap thten the output will be in the order vise. {a=1, p=2, l=1, e=1}

        HashMap<Character, Integer> map = new HashMap<>();                         // it will give the output like {p=2, a=1, e=1, l=1}.


        char[] char1 = str.toCharArray();
        for(char ch : char1)
        {
            if(map.containsKey(ch))
            {
                map.put(ch, map.get(ch) + 1);
            }
            else{
                map.put(ch , 1);
            }
        }
        System.out.println(map);                        // {p=2, a=1, e=1, l=1}

        for(char key : map.keySet())
        {
            System.out.println(key + " -> " + map.get(key));
        }

    }
}
