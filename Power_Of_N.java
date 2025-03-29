public class Power_Of_N
{
    public static double pow(double x , double n)
    {
        double ans=1;
        while (n > 0)
        {
            if(n%2==1)
            {
                ans = ans * x;
                n = n-1;
            }
            else
                  {
                n = n/2;
                x = x * x;
            }
        }
    return ans;
    }

    public static void main(String[] args)
    {
        double x = 2;
        double n = 20;
        System.out.println(pow(x,n));


    }

}
