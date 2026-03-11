package Array;
class largest {
    public static void main(String[] args)
    {
        int[] arr = {10,20,2,1,34,5,6,8,9};
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}