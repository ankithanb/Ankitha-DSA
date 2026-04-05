package LinearSearch;
import java.util.Arrays;
public class Search2D {
    public static void main(String[] args)
    {
        int[][] arr = {{23,5,6,4},
                       {},                                      // in this line,, we didn't gave the numbers but it is taken,, means it will internally assigns those numbers as 0.
                       {39,85,78,10}};
        int[] res = Search(arr);
        System.out.println(Arrays.toString(res));
    }

    static int[] Search(int[][] arr)
    {
        int target = 85;
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[i].length; j++)
            {
                if(arr[i][j] == target)
                {
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {-1,-1};
    }
}
