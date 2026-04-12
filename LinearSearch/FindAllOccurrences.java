package LinearSearch;

import java.util.Scanner;
import java.util.ArrayList;
public class FindAllOccurrences {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        ArrayList<Integer> Res = Search(arr,target);
        System.out.println(Res);
    }

    static ArrayList<Integer> Search(int[] arr, int target)
    {
        ArrayList<Integer> Res = new ArrayList<>();
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == target)
            {
                Res.add(i);
            }
        }
        return Res;
    }
}
