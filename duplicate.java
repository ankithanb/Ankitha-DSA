// public class duplicate {
//     public static void main(String[] args)
//     {
//         String str = "ababababcdcdcdcde";
//         str = str.toLowerCase();

//         for(int i = 0; i < str.length(); i++)
//         {
//             boolean isrepeat = false;
//             char ch = str.charAt(i);

//             for(int j = 0; j < i; j++)
//             {
//                 if(ch == str.charAt(j))
//                 {
//                     isrepeat = true;
//                     break;
//                 }
//             }
//             if(!isrepeat)
//             {
//                 int count = 0;
//                 for(int j = 0; j < str.length(); j++)
//                 {
//                     if(ch == str.charAt(j))
//                     {
//                         count++;
//                     }
//                 }
//                 if(count > 1)
//                 {
//                     System.out.println(ch);
//                 }
//             }
//         }
//     }
// }




public class duplicate {
    public static void main(String[] args)
    {
        String str = "ababababcdcdcdcde";
        str = str.toLowerCase();

        for(int i = 0; i < str.length(); i++)
        {
            boolean isrepeat = false;
            char ch = str.charAt(i);

            for(int j = 0; j < i; j++)
            {
                if(ch == str.charAt(j))
                {
                    isrepeat = true;
                    break;
                }
            }
            if(!isrepeat)
            {
               System.out.println(ch);
            }
        }
    }
}
