package StringCodes;

public class RotateString
{

    public  static  boolean isRotate(String s , String g)
    {
        String str;
        char ch[] = s.toCharArray();

        for(int  k=0 ; k<s.length();k++)
        {
            char first = ch[0];
            for (int i = 0; i < ch.length - 1; i++)
            {
                ch[i] = ch[i + 1];
            }
            ch[s.length()-1]=first;

            //String res = Arrays.toString(ch);
            String res = new String(ch);
            System.out.println(res);
            if(res.equals(g))
            {
                return  true;
            }
        }
    return false;
    }

    public static  boolean optimiseIsRotate(String s ,String g)
    {
        if(s.length() != g.length())
            return false;


        return (s+s).contains(g);

    }


    public static void main(String[] args)
    {
        String s = "abcde";
        String goal = "cdeab";
        //System.out.println(isRotate(s,goal));
        System.out.println(optimiseIsRotate(s,goal));
    }

}
