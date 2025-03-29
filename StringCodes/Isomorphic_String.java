package StringCodes;

import java.util.HashMap;
import java.util.Map;

public class Isomorphic_String
{

    public static  boolean isIsomorphic1(String s, String t)
    {
        Map<Character , Integer> smap = new HashMap<>();
        Map<Character , Integer> tmap = new HashMap<>();

        for(int i= 0 ; i<s.length();i++)
        {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            if(smap.containsKey(ch1))
            {
                smap.put(ch1, smap.get(ch1)+1);
            }
            else {
                smap.put(ch1, 1);
                }

            if(tmap.containsKey(ch2))
            {
                tmap.put(ch2,tmap.get(ch2)+1);
            }
            else {
                tmap.put(ch2, 1);
            }
            System.out.println("************");
            System.out.println(smap.get(ch1));
            System.out.println(tmap.get(ch2));

            if(smap.get(ch1) != tmap.get(ch2))
            {
                return  false;
            }
        }
        return  true;
    }

    public  static  boolean isIsomorphic(String s , String t)
    {
        int sarr[] = new int[256];
        int tarr[] = new int[256];

        if(s.length() != t.length())
        {
            return false;
        }

        for(int i=0 ; i<s.length();i++)
        {
           char ch1 = s.charAt(i);
           char ch2 = t.charAt(i);

           if(sarr[ch1] != tarr[ch2])
           {
               return  false;
           }

           sarr[ch1] = tarr[ch2] = i+1;
        }
        return  true;
    }

    public  static  boolean isIso(String s , String t)
    {
        int sarr[]= new int[256];
        int tarr[] = new int[256];

        for(int i= 0 ; i<s.length();i++)
        {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            if(sarr[ch1]!= tarr[ch2])
            {
                return  false;
            }

            sarr[ch1]=tarr[ch2]=i+1;
        }
        return  true;

    }
    public static void main(String[] args) {

        String s = "foo";
        String t = "boj";

        //System.out.println(isIsomorphic(s,t));
        System.out.println(isIso(s,t));

    }

}
