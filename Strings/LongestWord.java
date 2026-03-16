package Strings;

public class LongestWord {
    public static void main(String[] args)
    {
        String str = "Java is a programming language";
        String words[] = str.split(" ");

        String longest = " ";
        for(int i = 0; i < words.length; i++)
        {
            String word = words[i];
            if(word.length() > longest.length())
            {
                longest = word;
            }
        }
        System.out.println(longest +" " +longest.length());
    }
}
