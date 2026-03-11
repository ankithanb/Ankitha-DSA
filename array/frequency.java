package Array;
public class frequency {
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,1,2,3,4};
        for(int i = 0; i < arr.length; i ++)
        {
            boolean isrepeat = false;
            for(int j = 0; j < i; j++)
            {
                if(arr[i] == arr[j])
                {
                    isrepeat = true;
                    break;
                }
            }
            if(!isrepeat)
            {
                int count = 0;
                for(int j = 0; j < arr.length; j++)
                {
                    if(arr[i] == arr[j])
                    {
                        count++;
                    }
                }
                System.out.println(arr[i] +"="+count);
            }
        }
    }
}
