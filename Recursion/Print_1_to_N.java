package Recursion;

public class Print_1_to_N {

    public  static  void printToN(int i , int n)
    {
        if(i >= n+1)
        {
            //System.out.println(n);
            return;
        }

        System.out.print(i + " ,  ");
        printToN(i+1,n);

    }

    public  static  void  printNto1(int i , int n)
    {
        if(i <= 0)
        {
            //System.out.println(i);
            return;
        }

        System.out.print(i +" ,  ");
        printNto1(i-1 , n);
    }

    public static void  printPatter(int i,int j , int n)
    {
        if(i > n)
        {
            return;
        }
        if(j <= i)
        {
            System.out.print(" * ");
            printPatter(i ,j+1, n);
        }
        else
        {
            System.out.println();
            printPatter(i + 1, 1, n);
        }
    }

    public static void main(String[] args)
    {
        int n =5;
        printToN(1 ,n);
        System.out.println(" ");
        printNto1(n ,n);
        System.out.println();
        printPatter(1,1, n);

    }
}
