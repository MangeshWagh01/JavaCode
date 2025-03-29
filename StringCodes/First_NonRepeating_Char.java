package StringCodes;

import java.util.LinkedHashMap;
import java.util.Map;

public class First_NonRepeating_Char
{
    public static char findNonRepeating(String str)
    {
        int cnt[] = new int[26];

        for(char ch : str.toCharArray())
        {
            cnt[ch - 'a']++;

        }
        for(char ch : str.toCharArray())
        {
            if((cnt[ ch- 'a']) == 1)
            {
                return ch;
            }
        }

        return '_';
    }



    public static char findNonRepeatingUsingMap(String str)
    {
        Map<Character , Integer> map = new LinkedHashMap<>();

        for(char ch : str.toCharArray())
        {
            map.put(ch , map.getOrDefault(ch , 0) +1);
        }

        for(Map.Entry<Character, Integer>list : map.entrySet())
        {

            if(list.getValue()==1)
            {
                return list.getKey();
            }
        }
        return '_';

    }

    public static void main(String[] args)
    {
        String str  = "swiss";
        System.out.println(findNonRepeating(str));
    }

}
