import java.util.HashMap;

public class LongestSubStringWithoutRepeatatingChar
{

    public static int longestSubWORepeactCh(String str)
    {
        int len=0;
        int  maxLen=0;

        for(int i =0 ;i<str.length();i++)
        {
            //char ch = str.charAt(i);
            int hash[] = new int[256];

            for(int j=i ; j<str.length();j++)
            {

                char  ch = str.charAt(j);

                if(hash[ch] == 1)
                {
                    break;
                }
                hash[ch] = 1;
                len = j - i+1;
                maxLen =Math.max(maxLen , len);
            }


        }


        return  maxLen;
    }

    public  static  int optimizeSolutionRepeateStr(String str)
    {
        HashMap<Character , Integer> map = new HashMap<>();

        int n = str.length();
        int left= 0 ;
        int right = 0;
        int maxLen = 0;

        while (right < n)
        {
            if(map.containsKey(str.charAt(right)))
            {
                left = Math.max(map.get(str.charAt(right))+1 , left);
            }
            map.put(str.charAt(right), right);
            maxLen = Math.max(maxLen , right-left+1);
            right++;
        }
        return  maxLen;
    }

    public static void main(String[] args)
    {
        String str = "abcabcbb";
        System.out.println(longestSubWORepeactCh(str));
        System.out.println("Optimise Output Solution ");
        System.out.println(optimizeSolutionRepeateStr(str));

    }


}
