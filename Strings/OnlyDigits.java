package Strings;

public class OnlyDigits {
    public static void main(String[] args)
    {
        String str = "123456";
        boolean isOnlyDigits = true;

        for(int i = 0; i < str.length(); i++)
        {
            if(!Character.isDigit(str.charAt(i)))
            {
                isOnlyDigits = false;
                break;
            }
        }
        if(isOnlyDigits)
        {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
