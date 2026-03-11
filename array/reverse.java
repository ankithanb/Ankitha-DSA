package Array;
public class reverse {
    public static void main(String[] args)
    {
        int[] arr = {10,20,30,40,50,60};
        System.out.print("[");
        
        for(int i = arr.length - 1; i >= 0; i--)
        {
            System.out.print(arr[i]);
            if(arr[i] != arr[0])
            {
                System.out.print(" ");
            }
        }

        System.out.print("]");
    }
}
