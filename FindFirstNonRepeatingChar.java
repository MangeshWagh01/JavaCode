import java.util.HashMap;
import java.util.Map;

public class FindFirstNonRepeatingChar
{
        public  static  char findNChar(String str)
        {
            HashMap<Character , Integer> map = new HashMap<>();

            for(int i=0 ; i<str.length();i++)
            {
                if(map.containsKey(str.charAt(i)))
                {
                    map.put(str.charAt(i),map.get(str.charAt(i))+1);
                }
                else {
                    map.put(str.charAt(i),1);
                }
            }
            for(Map.Entry<Character , Integer> list : map.entrySet())
            {
                if(list.getValue()==1)
                {
                    return  list.getKey();
                }
            }
            return '.';
        }

        public  static  char find1(String str)
        {
            int count[] = new int[26];
            int i=0;

            for(char c : str.toCharArray())
            {
                count[c - 'a']++;
            }

//            for(int a : count)
//            {
//                System.out.print(a + "  ");
//            }

            for (int j =0; j<str.length();j++)
            {
                if(count[str.charAt(j)-'a']==1)
                {
                    return  str.charAt(j);
                }
            }
            return '.';
        }

    public static void main(String[] args) {

        String str = "aabbcde";
        // System.out.println(findNChar(str));
        System.out.println(find1(str));

    }

}
