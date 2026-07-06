package HashSet;
import java.util.HashSet;
public class UnionOfTwoArrays {
    public static void main(String[] args)
    {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6,3,2};

        HashSet<Integer> set = new HashSet<>();
        for(int num : arr1)
        {
            set.add(num);
        }
        for(int num : arr2)
        {
            set.add(num);
        }
        System.out.println(set);
    }
}
