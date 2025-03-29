package Math_Computation;

public class Armstrong_Number
{
    public static boolean findArmstrong(int num)
    {
        int digit=0;
        int n = num;
        //int o = n;

        while (n >0)
        {
            n = n / 10;
            digit++;
        }
       // System.out.println(digit);
        double total = 0;
        int n1 = num;

        while(n1>0)
        {
            int digit1 = n1 % 10 ;
            n1 = n1  / 10;
            total += Math.pow(digit1 ,digit);

        }
        System.out.println("total " +total);

        if(num == total)
        {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        //int n = 153;
        int n = 9474;

        System.out.println(findArmstrong(n));


    }
}
