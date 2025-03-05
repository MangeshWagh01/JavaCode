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

    public static void main(String[] args)
    {
        int i = 6;
        //System.out.println("\n final ans "+ fibo(i));
        System.out.println(fib(i));
    }

}
