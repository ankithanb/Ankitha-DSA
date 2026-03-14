package Strings;
public class vowelsConso {
    public static void main(String[] args)
    {
        String str = "Python";
        str = str.toLowerCase();
        int vowels = 0;
        int consonents = 0;

        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                vowels++;
            }
            else{
                consonents++;
            }
        }
        System.out.println("Vowels: " + vowels +" Consonents: "+consonents);
    }
}
