public class frequency {
    public static void main(String[] args)
    {
        String str = "java";

        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            boolean isRepeat = false;
            for(int j = 0; j < i; j++)
            {
                char chh = str.charAt(j);
                if(ch == chh)
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
                    char chh = str.charAt(j);
                    if(ch == chh)
                    {
                        count++;
                    }
                }
                System.out.println(ch +" "+ count);
            }
        }
    }
}
