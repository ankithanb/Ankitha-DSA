public class palindrome {
    public static void main(String[] args)
    {
        String str = "madam";
        str = str.toLowerCase();
        String strr = "";

        for(int i = str.length() - 1; i >= 0; i--)
        {
            char ch = str.charAt(i);
            strr = strr + ch;
        }
        System.out.println(strr);
        // if(str.equals(strr))
        // {
        //     System.out.println("Yes");
        // }
        // else{
        //     System.out.println("No");
        // }

        System.out.println(str.equals(str) ? "Yes" : "No");  // ternary operation.
    }
}
