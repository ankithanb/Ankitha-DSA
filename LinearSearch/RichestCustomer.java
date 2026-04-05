package LinearSearch;

public class RichestCustomer {
    public static void main(String[] args)
    {
        int[][] arr= {{1,2,3},
                      {4,2,1}};
        System.out.println(Rich(arr));
    }

    static int Rich(int[][] arr)
    {
        int ans = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++)
        {
            int sum = 0;
            for(int j = 0; j < arr[i].length; j++)
            {
                sum += arr[i][j];
            }
            if(sum > ans)
            {
                ans = sum;
            }
        }
        return ans;
    }
}

// in this ,, we have to find highest sum by calculating each row total sum..