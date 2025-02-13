public class StringAnagram
{
    public static  boolean isAnagram(String s ,String t)
    {
        int a = s.length();
        int b = t.length();

        if(a!=b)
        {
            return  false;
        }
        else
        {
            int count[] =new int[26];

            for(int i=0 ; i<a;i++)
            {
                count[s.charAt(i)-'a']++;
                count[t.charAt(i)-'a']--;

            }

            for(int ab : count)
            {
                if(ab!=0)
                {
                    return false;
                }
            }
            return  true;

        }

    }

    public static void main(String[] args)
    {
        String s = "cat";
        String t = "tas";
        System.out.println(isAnagram(s,t));

    }
}
