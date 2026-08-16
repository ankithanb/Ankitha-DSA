package Array;

public class primeNumInRange {
    public static void main(String[] args)
    {
        int[] arr = {1,5,8,7,6,11,2,3};
        int i = 0;
        while(i < arr.length)
        {
            boolean isPrime = true;
            if(arr[i] <= 1)
            {
                i++;
                continue;
            }
            for(int n = 2; n <= arr[i] / 2; n++)
            {
                if(arr[i] % n == 0)
                {
                    isPrime = false;
                    break;
                }
            }

            if(isPrime)
                System.out.print(arr[i]+" ");
            i++;
        }
    }
}
