// to get a missing number.
package Array;
public class missingNum {
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,5,6,7,8,9};
        int result = missing(arr);
        System.out.println(result);
    }

    static int missing(int[] arr)
    {
        int i = 0;
        while(i < arr.length)
        {
            int correct = arr[i] - 1;
            if(arr[i] <= arr.length && arr[i] != arr[correct])
            {
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
        for(int index = 0; index < arr.length; index++)
        {
            if(arr[index] != index + 1)
            {
                return index + 1;
            }
        }
        return arr.length + 1;
    }
    static void swap(int[] arr, int first , int second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
