package HashMap;
import java.util.HashSet;

public class LongestSubarray {
    public static void main(String[] args)
    {
        int[] arr = {100,200,30,5,4,6,2,3,4,1};
        System.out.println(Longest(arr));
    }
    static int Longest(int[] arr)
    {
        if(arr.length == 0)
        {
            return 0;
        }
        int longest = 0;

        HashSet<Integer> set = new HashSet<>();
        for(int num : arr)
        {
            set.add(num);
        }

        for(int num : set)
        {
            if(!set.contains(num - 1))
            {
                int currentNum = num;
                int currentLength = 1;

                while(set.contains(currentNum + 1))
                {
                    currentNum++;
                    currentLength++;
                }
               // longest = Math.max(longest, currentLength);
               if(currentLength > longest)
               {
                longest = currentLength;
               }
            } 
        }
        return longest;
    }
}
