public class LongSunstring {
    public static void main(String[] args)
    {
        String str = "abcabcbb";
        int maxLength = 0;

        for(int i = 0; i < str.length(); i++)
        {
            String current = "";
            for(int j = i; j < str.length(); j++)
            {
                char ch = str.charAt(j);
                if(current.indexOf(ch) != -1)
                {
                    break;
                }
                current += ch;
                maxLength = Math.max(maxLength, current.length());
            }
        }
        System.out.println(maxLength);
    }
}
