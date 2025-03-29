package StringCodes;

import java.util.Arrays;

public class PallindromeSubString
{

    public  static String findPallindromeSubString(String str)
    {
        StringBuilder sb = new StringBuilder();
        int cnt = 0;

        for(int i=0 ; i<str.length();i++)
        {
            for(int j=i ; j <str.length();j++)
            {
              //  System.out.println(str.substring(i , j+1));
                String s = str.substring(i , j+1);
                StringBuilder rev = new StringBuilder(s);
                //System.out.println("Reverse  =  "+ rev.reverse());
                rev.reverse();
                if(s.equals(rev.toString()))
                {
                  //  return "Pallindrome String is "+ s;
                    cnt++;
                    System.out.println("Pallindrome String is "+ s);
                }
            }
        }

        System.out.println("Count = "+cnt);

        return "";
    }

    public static void main(String[] args)
    {
        String str = "aaa";
        System.out.println(findPallindromeSubString(str));


    }

}
