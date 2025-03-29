package StringCodes;

import java.util.HashMap;
import java.util.Map;

public class SortCharacterByFrequency
{
        public static  String sortCharByFreq(String s)
        {
            Map<Character , Integer> map = new HashMap<>();

            for(int i=0; i<s.length();i++)
            {
                char ch = s.charAt(i);
                if(map.containsKey(ch))
                {
                    map.put(ch , map.get(ch)+1);
                }
                else
                {
                    map.put(ch , 1);
                }

                System.out.println(" key  " +ch + "  value  "+ map.get(ch));
            }

            return  "";
        }

    public static void main(String[] args) {

       String s = "tree";
        System.out.println(sortCharByFreq(s));

    }

}
