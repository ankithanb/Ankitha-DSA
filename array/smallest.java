package Array;
public class smallest {
    public static void main(String[] args)
    {
        int[] arr = {10,2,5,43,-1,6,89,54,1,7};
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] < min)
            {
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
