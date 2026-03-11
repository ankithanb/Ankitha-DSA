package Array;
public class linearSearch {
    public static void main(String[] args)
    {
        int[] arr = {10,20,30,4,5,3,66,8,9};
        int target = 3;

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == target)
            {
                System.out.println(i);
            }
        }
    }
}
