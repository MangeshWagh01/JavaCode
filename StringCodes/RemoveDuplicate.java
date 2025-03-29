package StringCodes;

import java.util.Scanner;

public class RemoveDuplicate
{
    public  static  String removeDuplicate(String str)
    {
        boolean vis[] = new boolean[256];
        StringBuilder res = new StringBuilder();

        for(char ch : str.toCharArray())
        {
            if(!vis[ch])
            {
                vis[ch] = true;
                res.append(ch);

            }

        }
       return res.toString();
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        String str[]=new String[a];
        for(int i=0 ; i<a;i++)
        {
            str[i] = sc.next();
        }

        for (int i=0;i<a;i++)
        {
            System.out.println(removeDuplicate(str[i]));
        }


    }



}
