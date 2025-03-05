package Recursion;

public class isPalindromeNumber {

    public static boolean isPallindrome(int i ,String str)
    {
        if(i >=str.length()/2)
        {
            return true;
        }
        if(str.charAt(i) != str.charAt(str.length()-i-1))
        {
            return  false;
        }

     return  isPallindrome(i+1,str);

    }

    public static void main(String[] args)
    {
        String str = "madams";
        System.out.println(isPallindrome(0,str));
    }
}
