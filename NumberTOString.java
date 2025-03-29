import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class NumberTOString {

    //public static void  magicBoard(String arr[])
    public static void  magicBoard(String str)
    {

        String s[] = str.split(" ");
       // System.out.println(s.toString());

        for(String numStr : s) {
            try {


                String num = numStr;

                int n = Integer.parseInt(num);

                char ch = (char) n;
                System.out.println(ch);


            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public static  void magicBoard(int num[])
    {
       // System.out.println(num.length);
        for(int i=0 ; i<num.length ; i++)
        {
            int n = num[i];
            char ch = (char)(n);

            System.out.println(ch);

        }
    }


    public static void main(String[] args) throws IOException {
        String arr[]= {"65", "66","67"};
        String str = "65 66 67";
        //magicBoard(str);


        //int num[] = {65,66,67};
        int num[] = {97,99,103};
        magicBoard(num);

    }
}
