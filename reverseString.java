public class reverseString {

    public static boolean isPalindrome(String  str)
    {
        int n = str.length();

        for(int i=0 ; i<n/2; i++)
        {
            if(str.charAt(i) != str.charAt(n-1-i))
            {
                return  false;
            }
        }
        return  true;

        //        for(int i = str.length()-1 ; i>=0;i--)
        //        {
        //            char ch = str.charAt(i);
        //            str1 = str1+ch;
        //        }
        //        int n = str.length()-1;
        //
        //
        //  System.out.println(str1);
        //System.out.println(str.equals(str1));

    }

    public static  boolean validPallindrom(String str)
        {
            //A man, a plan, a canal: Panama

            String s = str.toLowerCase().replaceAll( "[^A-Za-z0-9]","");
            int n = s.length();
            System.out.println(s);

            for(int i=0 ; i<n/2;i++)
            {
                if(s.charAt(i)!= s.charAt(n-1-i))
                {
                    return false;
                }
            }

            return true;
        }


    public static  void  reverseStrings(char s[])
    {
        //1. Errro Beacuse String
//        for(int i=s.length-1; i>=0;i--)
//        {
//            System.out.print(s[i]+"");
//        }


        // 2. Useing StringBuilder
//        StringBuilder sb =new StringBuilder(new String(s)).reverse();
//
//        for(int i=0 ; i<s.length;i++)
//        {
//            s[i] = sb.charAt(i);
//            System.out.print(s[i]);
//        }

        // usign Two Pointer

        int n = s.length;
        int left = 0;
        int right = n-1;

        while (left < right)
        {
            char ch = s[left];
            s[left] = s[right];
            s[right] = ch;

            left++;
            right--;
        }

        for(char ch : s)
        {
            System.out.print(ch+" ");
        }

    }


    public  static  boolean StudentAtttendenceAward(String s)
    {
        int a1=0;
        int l1 =0;

        for(int i=0; i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch == 'A')
            {
                a1++;
                    if(a1>=2)
                      return false;

            }
            if(ch=='L')
            {
                l1++;
                if(l1==3)
                    return false;

            }
            else
            {
                l1=0;
            }

        }

       return a1<2&&l1<3;
    }

    public static void main(String[] args)
    {
        //***************************************************

       // String str = "masmmm";
       // System.out.println("String are Pallindrome : ="+ isPalindrome(str));

        //***************************************************
        //Input: s = "A man, a plan, a canal: Panama"
        //String str = "A man, a plan, a canal: Panamas";
        //System.out.println(validPallindrom(str));

        //***************************************************
        //s = ["h","e","l","l","o"]
//        char s[] = {'h','e','l','l','o'};
//        reverseStrings(s);


        //***************************************************
            // Student Attendence Awanrd

        String str = "PPALLL";
        System.out.println(StudentAtttendenceAward(str));
    }
}
