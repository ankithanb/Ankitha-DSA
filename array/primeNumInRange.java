package Array;
o
public class primeNumInRange {
    public static void main(String[] args)
    {
        int[] arr = {1,5,8,7,6,11,2,3};
        int i = 0;
        while(i < arr.length)
        {
            if(arr[i] <= 1)
            {
                continue;
            }
            for(int n = 2; n <= arr[i] / 2; n++)
            {
                if(arr[i] % 2 == 0)
                {
                    continue;
                }
            }
            System.out.println(arr[i]);
        }
    }
}
