package Strings;

public class CountCharacters {
    public static void main(String[] args)
    {
        String str = "Java";
        char[] ch = str.toCharArray();
        int count = 0;

        for(int i = 0; i < ch.length; i++)
        {
            count++;
        }
        System.out.println(count);
    }
}
