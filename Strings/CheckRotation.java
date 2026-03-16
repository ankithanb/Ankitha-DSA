package Strings;

public class CheckRotation {
    public static void main(String[] args)
    {
        String str = "abcd";
        String result = " ";
        result = str + str;

        String res = result.contains("cdab") ? "True" : "False" ;
        System.out.println(res);
    }
}
