// Without margeSort.

public class countInversions {
    public static void main(String[] args)
    {
        int[] arr = {5,2,4,1,3,6,7,9};
        int count = 0;
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr.length; j++)
            {
                if(arr[i] > arr[j])
                {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
