package Array;
import java.util.ArrayList;
public class TrappedRain {
    public static void main(String[] args)
    {
        int[] arr = {4,2,0,3,2,5};
        int leftMax = Integer.MIN_VALUE;
        ArrayList<Integer> List1 = new ArrayList<>();

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] > leftMax)
            {
                leftMax = arr[i];
            }
            List1.add(leftMax);
        }

        int rightMax = Integer.MIN_VALUE;
        ArrayList<Integer> List2 = new ArrayList<>();

        for(int i = arr.length - 1; i >= 0 ; i--)
        {
            if(arr[i] > rightMax)
            {
                rightMax = arr[i];
            }
            List2.add(rightMax);
        }

        //System.out.println(List1);    for reference purpose only
        //System.out.println(List2);

        int[] H = new int[arr.length];
        int count = 0;
        for(int i = 0; i < arr.length; i++)
        {
            H[i] = Math.min(List1.get(i) , List2.get(i)) - arr[i];
            //System.out.print(H[i]+" ");
            count += H[i];
        }
        //System.out.println();
        System.out.println(count);
    }
}
