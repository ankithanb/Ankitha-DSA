package Strings;

public class RemoveSpaces {
    public static void main(String[] args)
    {
        String str = "   Java is a programming language   . ";

        // for(int i = 0; i < str.length(); i++)
        // {
        //     char ch = str.charAt(i);
        //     if(ch == ' ')
        //     {
        //         continue;
        //     }
        //     System.out.print(ch);
        // }

        str = str.replaceAll(" ","");
        System.out.println(str);
        
    }
}
