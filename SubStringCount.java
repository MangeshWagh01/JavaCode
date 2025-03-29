import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SubStringCount
{
    public  static  int findSubstring(String str)
    {
        Set<String> set = new HashSet<>();
        int n = str.length();

        for(int i=0 ; i<n ; i = i+3)
        {
            String s = str.substring(i , i+3);
            char ch[] = s.toCharArray();
            Arrays.sort(ch);


           // System.out.println(Arrays.toString(ch));

            set.add(Arrays.toString(ch));

        }

        for(String s : set)
        {
            System.out.println(s+ " ");
        }

        return  set.size();
    }

    public static void main(String[] args)
    {
        String str = "ABCBCA";
        System.out.println(findSubstring(str));
    }
}
