package HashSet;
import java.util.HashSet;
public class CountDistinct {
    public static void main(String[] args)
    {
        int[] arr = {1,2,5,4,6,3,6,7,5,4,3,2};
        HashSet<Integer> set = new HashSet<>();

        int count = 0;
        for(int num : arr)
        {
            set.add(num);
        }

        System.out.println(set.size());
    }
}
