package Math_Computation;

public class SumOfDigit
{
    public  static int findSum(int n)
    {
        int sum = 0;

        while (n > 0)
        {
            int digit = n % 10;
            System.out.println("Digit = "+digit);
            n = n/10;
            System.out.println("Number = "+n);

            sum = sum+digit;
        }

        return sum;
    }

    public static void main(String[] args)
    {
        int n =1454324;
        System.out.println(findSum(n));

    }

}
