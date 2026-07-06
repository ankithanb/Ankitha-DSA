package HashSet;
import java.util.HashSet;
public class IntersectionOf2Arrays {
    public static void main(String[] args)
    {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();

        int[] arr1 = {1,2,3,4};
        int[] arr2 = {3,4,5,6};

        for(int num : arr1)
        {
            set.add(num);
        }

        for(int num : arr2)
        {
            if(set.contains(num))
            {
                result.add(num);
            }
        }
        System.out.println(result);
    }
}
