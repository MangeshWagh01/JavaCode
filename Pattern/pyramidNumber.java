package Pattern;

public class pyramidNumber
{
    public static void printPattern(int n)
    {
        int cnt =1;
        for(int i = 0; i<n ; i++)
        {
            System.out.print(cnt+" ");
            for(int j=0 ; j<=i-1;j++)
            {
                //System.out.print("*"+" ");
                cnt = cnt+2;
                System.out.print( cnt+" ");
            }
            System.out.println();
            cnt =cnt + 3;
        }


    }


    public static void main(String[] args)
    {
        printPattern(4);

    }

}
