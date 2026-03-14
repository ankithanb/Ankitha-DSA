package Strings;
public class reverse {
    public static void main(String[] args)
    {
        String str = "Java";
        str = str.toLowerCase();
        String strr = " ";

        for(int i = str.length() - 1; i >= 0; i--)
        {
            char ch = str.charAt(i);
            strr = strr + ch;
            
        }   
        strr= strr.concat("Helo");        // in here,, concat can work only on strings not to characters..
        System.out.println(strr); 
    }
}
