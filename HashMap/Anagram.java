package HashMap;
import java.util.HashMap; 

public class Anagram {
    public static void main(String[] args)
    {
        String str1 = "listen";
        String str2 = "silent";

        System.out.println(Anagrams(str1, str2));
    }

    // static boolean Anagrams(String str1, String str2)
    // {

    //     if(str1.length() != str2.length()) return false;

    //     HashMap<Character, Integer> map1 = new HashMap<>();
    //     HashMap<Character, Integer> map2 = new HashMap<>();

    //     char[] ch1 = str1.toCharArray();
    //     char[] ch2 = str2.toCharArray();

    //     for(char ch : ch1)
    //     {
    //         if(map1.containsKey(ch))
    //         {
    //             map1.put(ch, map1.get(ch) + 1);
    //         }
    //         else{
    //             map1.put(ch, 1);
    //         }
    //     }

    //     for(char ch : ch2)
    //     {
    //         if(map2.containsKey(ch))
    //         {
    //             map2.put(ch, map2.get(ch) + 1);
    //         }
    //         else{
    //             map2.put(ch, 1);
    //         }
    //     }

    //     for(char ch : ch2)
    //     {
    //         if(!map1.containsKey(ch) || !map1.get(ch).equals(map2.get(ch)))
    //             return false;
    //     }
    //     return true;
    // }

    static boolean Anagrams(String str1, String str2) 
    {
        if(str1.length() != str2.length()) 
        {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        for(char ch : str1.toCharArray())
        {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for(char ch : str2.toCharArray())
        {
            if(!map.containsKey(ch)) 
            {
                return false;
            }
            map.put(ch, map.get(ch) - 1);

            if(map.get(ch) == 0)
            {
                map.remove(ch);
            }
        }
        
        return map.isEmpty();
    }
}