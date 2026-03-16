package Strings;

public class ReverseEachWord {
    public static void main(String[] args)
    {
        String str = "Hello Java";
        String words[] = str.split(" ");   
        for(int i = 0; i < words.length; i++)
        {
            String word = words[i];
            String rev = " ";
            for(int j = word.length()-1; j >= 0; j--)
            {
                rev += word.charAt(j);
            }
            System.out.print(rev);
        }
    }
}
