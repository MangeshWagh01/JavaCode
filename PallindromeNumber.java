public class PallindromeNumber
{
    private  static  String checkPallindrome(int num)
    {
        int orgNum =num;
        int rem = 0;
        while(num>0)
        {
            int digit= num % 10;
            rem = rem*10+digit;
            num = num/10;
        }
        if(rem == orgNum)
        {
            return orgNum+" is Pallindrome";
        }

        return orgNum+ " NOT PALLINDROME";

    }

    public static void main(String[] args)
    {
        int num =1231;
        System.out.println(checkPallindrome(num));


    }
}
