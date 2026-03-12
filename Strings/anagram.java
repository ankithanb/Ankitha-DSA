package Strings;
import java.util.Arrays;
public class anagram {
    public static void main(String[] args)
    {
        String str = "Listen";
        String strr = "Silent";

        str = str.toLowerCase();
        strr = strr.toLowerCase();

        char[] arr = str.toCharArray();
        char[] arrr = strr.toCharArray();

        Arrays.sort(arr);
        Arrays.sort(arrr);

        System.out.println(arr);
        System.out.println(arrr);
        System.out.println( Arrays.equals(arr,arrr) ? "Yes both are anagrams." : "No");
    }
}
