package Math_Computation;

public class PallindromeNumber
{
    public static  boolean isPallindrome(int n)
    {
        int original = n;

        int rev=0;

        while (n >0)
        {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n/10;
        }
       // System.out.println(rev);

        if(original == rev)
        {
            return  true;
        }
        return  false;
    }

    public static void main(String[] args) {
        int n = 132;
        System.out.println(isPallindrome(n));


    }

}
