import java.util.Arrays;

public class practice
{
    public  static  int fibo(int n)
    {
        int first = 0;
        int second =1;
        int temp=0;
        System.out.print(first + "  "+ second+"  ");

        for(int i=2 ; i<=n ; i++)
        {
            temp = first+second;
            System.out.print(temp + " ");
            first = second;
            second = temp;
        }
       // System.out.println(first+" "+ second  + " " + temp );
        return  temp;
    }

    public  static  int fib(int n)
    {
        if(n<= 1)
        {
            return n;

        }
        return  fib(n-1)+fib(n-2);
    }

    public static void main1(String[] args)
    {
        int i = 6;
        //System.out.println("\n final ans "+ fibo(i));
        System.out.println(fib(i));
    }

    public static void main2(String[] args)
    {

        int num =120;
        String str = Integer.toString(num);
        //String str1 = String.valueOf(num);
        //System.out.println(str1);
        StringBuilder sb = new StringBuilder();
        for(int i = str.length()-1 ; i>=0;i--)
        {
            sb.append(str.charAt(i));
        }
        if(str.equals(sb.toString()))
        {
            System.out.println("Pallindrom.....");
        }
        else
        {
            System.out.println("NOT PALLINDROME....");
        }
    }


    public  static  boolean isValid(int num)
    {
        if(num >= 0 && num <=255)
        {
            return  true;
        }
        return  false;
    }

    public static void main3(String[] args) {
        //  String str = "222.111.111.111.111";
        //String str = "5555..555";
        // String str = "0.0.0.255";
        String str = "255.212.255.255";

        String s = "1234";
        int num = s.charAt(3) - '0';
        System.out.println(num + 2);
    }


    public static void main(String[] args)
    {
    String str = "12345";

    int sum=0;
    for(int i=0; i<str.length();i++)
    {
        int n = str.charAt(i)-'0';
        sum +=n;
    }

        System.out.println("Sum of Digit of "+ str + " is = " + sum);
    }
}

