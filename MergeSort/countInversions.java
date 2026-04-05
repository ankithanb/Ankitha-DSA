// Without margeSort.
// Brute force code.
// public class countInversions {
//     public static void main(String[] args)
//     {
//         int[] arr = {5,2,4,1,3,6,7,9};
//         int count = 0;
//         for(int i = 0; i < arr.length; i++)
//         {
//             for(int j = i+1; j < arr.length; j++)
//             {
//                 if(arr[i] > arr[j])
//                 {
//                     count++;
//                 }
//             }
//         }
//         System.out.println(count);
//     }
// }


// Using MergeSort Technique.

import java.util.*;
public class countInversions {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        int Result = CountInversions(arr);
        System.out.println(Result);
        sc.close();
    }

    static int CountInversions(int[] arr)
    {
        int mid = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr , 0 , mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);

        return Count(left, right);
    }
    static int Count(int[] first, int[] second)
    {
        int i = 1, j = 1;
        int count = 0;
        int a = 0;
        while(i < first.length)
        {
            if(first[a] > first[i])
            {
                count++;
            }
            i++;
            a++;
        }
        int b = 0;
        while(j < second.length)
        {
            if(second[b] > second[j])
            {
                count++;
            }
            j++;
            b++;
        }

        int m = 0, n = 0;
        while(m < first.length && n < second.length)
        {
            if(first[m] > second[n])
            {
                count++;
            }
            m++;
            n++;
        }
        return count;
    }
}

