// this is a program to find the smallest letter greater than target..
// one note point is:in this proggram, all int is replaced by char ..
//time complexity is O(log n) Logerthemic for binary search.


package BinarySearch;

public class SmallestLetter {
    public static void main(String[] args)
    {
        char[] arr = {'a','e','i','o','u'};
        char target = 'o';
        System.out.println(Search(arr, target));
    }

    static char Search(char[] arr, char target)
    {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end)
        {
            int mid = start + (end-start) / 2;
            if(target < arr[mid])
            {
                end = mid - 1;
            }
            else
            {
                start = mid + 1;
            }
        }
        return arr[start % arr.length];
    }
}
