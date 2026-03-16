package Strings;

public class StringCompression {
    public static void main(String[] args)
    {
        String str = "aaabbbcc";
        for(int i = 0; i < str.length(); i++)
        {
            boolean isRepeat = false;
            for(int j = 0; j < i; j++)
            {
                if(str.charAt(i) == str.charAt(j))
                {
                    isRepeat = true;
                    break;
                }
            }
            if(!isRepeat)
            {
                int count = 0;
                for(int j = 0; j < str.length(); j++)
                {
                    if(str.charAt(i) == str.charAt(j))
                    {
                        count++;
                    }
                }
                System.out.print(str.charAt(i)+""+count);
            }
        }
    }
}
