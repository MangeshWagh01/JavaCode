package StringCodes;

import java.util.Arrays;

public class Longest_Common_Prefix
{
    public static String longestCommonPrefix(String s[])
    {
        Arrays.sort(s);
        String str1  = s[0];
        String str2 = s[s.length-1];
        int idx=0;

        while(idx < str1.length())
        {
            if(str1.charAt(idx) == str2.charAt(idx))
            {
                idx++;
            }
            else
            {
                break;
            }
        }

        return  idx==0?"":str1.substring(0,idx);
    }

    public static void main(String[] args)
    {
      String strs[] = {"flower","flow","flight"};

        System.out.println(longestCommonPrefix(strs));


    }

}
