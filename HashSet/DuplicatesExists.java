package HashSet;
import java.util.HashSet;
public class DuplicatesExists {
    public static void main(String[] args)
    {
        int[] arr = {1,3,4,5,2,5,6};

        System.out.println(Duplicate(arr));
    }
    static boolean Duplicate(int[] arr)
    {
        HashSet<Integer> set = new HashSet<>();
        for(int num : arr)
        {
            if(set.contains(num))
            {
                return true;
            }
            set.add(num);
        }
        return false;
    }
}
