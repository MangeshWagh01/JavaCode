package Math_Computation;

public class GCD
{


    public static int findgcd(int num1 , int num2)
    {
        while (num2 != 0)
        {
            int temp = num2;

            num2 = num1 % num2;

            num1 = temp;
        }
        return  num1;

    }

    public static  int findgcd_2(int num1 , int num2)
    {

        while(num1 != num2)
        {
            if(num1 > num2)
                num1 = num1 - num2;
            if(num2 > num1)
                num2 =num2 - num1;
        }

        return num1;

    }
    public static void main(String[] args)
    {
        int n1 = 48;
        int n2 = 18;

        //int gcd = findgcd(n1 , n2);
        int gcd = findgcd_2(n1 , n2);

        System.out.println(gcd);

    }


}
