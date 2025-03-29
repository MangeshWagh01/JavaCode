public class PerfectSquare
{


    public static void main(String[] args) {

        int n = 100;

        for(int i= 0 ; i<=n/2 ; i++)
        {
            if( i * i == n)
            {
                System.out.println("its Perfect Square of "+ i);
                break;
            }
        }

    }
}
