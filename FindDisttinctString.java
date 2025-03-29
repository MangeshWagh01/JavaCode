import java.util.*;

public class FindDisttinctString
{
    public static  int findCount(String str[])
    {
        int cnt = 0;

     //   Map<Character , Integer > map = new HashMap<>();
        Set<String> set = new TreeSet<>();

        for(int i=0 ;i<str.length ; i++)
        {

            String ele =str[i];
            char ch [] = ele.toCharArray();
            Arrays.sort(ch);
            String str1 = Arrays.toString(ch);
            //System.out.println(str1);
            set.add(str1);
        }


        return set.size();
    }


    public static void main(String[] args)
    {

       // String str[] ={"abcd" , "bacd" , "dref"};
        String str[] = {"bcd","cdb"};

        System.out.println(findCount(str));
    }
}
