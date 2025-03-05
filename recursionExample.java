public class recursionExample
{
    public  static int factorial(int n)
    {
        int ans=1 ;
        if(n==0)
        {
            return ans;
        }
        System.out.println(n);
         ans = n *factorial(n-1);
       // System.out.println(ans);
        return ans;
    }


    public static void main(String[] args)
    {
        int n=5;

        System.out.println(factorial(n));
    }

}
