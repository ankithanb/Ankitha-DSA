package LinearSearch;

public class MaxNum {
    public static void main(String[] args)
    {
        int[][] arr = {{85,6,3,49},
                       {98,55,87,52},
                       {99,87,41,100}};
        System.out.println(Search(arr));
    }

    static int Search(int[][] arr)
    {
        int max = arr[0][0];
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[i].length; j++)
            {
                if(arr[i][j] > max)
                {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
}


// Description..
//it's time complexity is O(n2) Quadratic,, because here we used nested loop ..
//this time complexity is so verst.. compare to others.