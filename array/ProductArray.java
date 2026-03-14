package Array;
import java.util.ArrayList;
public class ProductArray {
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4};
        ArrayList<Integer> List = new ArrayList<>();
        for(int i = 0; i < arr.length; i++)
        {
            int product = 1;
            for(int j = 0; j < arr.length; j++)
            {
                if(j == i)
                {
                    continue;
                }
                product *= arr[j];
            }
            List.add(product);
        }
        System.out.println(List);
    }
}
