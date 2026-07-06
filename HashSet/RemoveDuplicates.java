package HashSet;
import java.util.HashSet;
public class RemoveDuplicates {
    public static void main(String[] args)
    {
        int[] arr = {1,4,3,2,5,3,4};
        
        HashSet<Integer> set = new HashSet<>();
        for(int num : arr)
        {
            if(!set.contains(num))
            {
                set.add(num);
            }
        }
        System.out.println(set);
    }
}
