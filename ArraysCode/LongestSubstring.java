package ArraysCode;

import javax.print.CancelablePrintJob;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstring
{
    // Optimise Approach

    public  static  int findLongestSubStr(String str)
    {
        int left=0  , right = 0;
        int maxLen = 0 ;
        int n = str.length();
        Map<Character , Integer> map = new HashMap<>();


        while (right < n)
        {
            char ch = str.charAt(right);

            if(map.containsKey(ch))
            {
                left = Math.max(map.get(ch)+1 , left);
            }

            map.put(ch , right);
            maxLen = Math.max(maxLen , right-left+1);
            right++;


        }



return  maxLen;

    }

    // O(n3) approach

    public  static int findLongestSubStringBetter(String str)
    {
        int left = 0 ;
        int len =0;

        Set<Character> set = new HashSet<>();
        for(int i = 0 ;i<str.length(); i++)
        {
            char ch = str.charAt(i);
            if(set.contains(ch))
            {
                while(left < i && set.contains(ch))
                {
                    set.remove(ch);
                    left++;
                }
            }
            set.add(ch);
            len = Math.max(len, i-left+1);

        }
        return  len;
    }

    public static void main(String[] args)
    {
        String str ="abcabcbb";

        System.out.println(findLongestSubStringBetter(str));


        System.out.println(findLongestSubStr(str));


    }

}
