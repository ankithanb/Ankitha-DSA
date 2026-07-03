package HashMap;
import java.util.HashMap;
import java.util.Arrays;
import java.util.Scanner;
public class TwoSum {
    public static void main(String[] args)
    {
        // int[] nums = {2,7,11,15};
        // int target = 9;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++)
        {
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        System.out.println(Arrays.toString(TwoSums(nums, target)));
        sc.close();
    }
    static int[] TwoSums(int[] nums, int target)
    {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++)
        {
            int comple = target - nums[i];

            if(map.containsKey(comple))
            {
                return new int[] {map.get(comple), i};
            }

            map.put(nums[i], i);
        }
        return new int[] {-1,-1};
    }
}
