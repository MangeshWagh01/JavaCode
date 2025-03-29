public class PrimeNumber
{

    public static boolean isPrime(int num)
    {
        for(int i=2; i <= num/2 ; i++)
        {
            if(num % i == 0)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args)
    {

        int a =2;
        int b= 15;

        System.out.println("Prime Number Between "+a +" - "+ b);
        for(int i=a ; i<=b ; i++)
        {
            if(isPrime(i))
            {
                System.out.print(i + " ");
            }

        }

    }

}
