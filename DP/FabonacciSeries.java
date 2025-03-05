package DP;

import java.util.Arrays;

public class FabonacciSeries
{
    // Memoization Approach in DP (TOP-BOTTOM APPROACH)

    public  static int fibM(int n , int dp[])
    {
            if(n <=1)
            {
                return n;
            }

            if(dp[n] != -1)
            {
                return  dp[n];
            }

            return  dp[n] = fibM(n-1, dp) + fibM(n-2 , dp);
    }

    // Tabulation Approach in DP (BOTTOM - UP APPROACH)

    public static  int fibT(int n)
    {
        int prev2 = 0;
        int prev = 1;


        for(int i=2; i<=n;i++)
        {
            int curr_i = prev2+prev;
            prev2 = prev;
            prev = curr_i;
        }
        return prev;
    }

    public static void main(String[] args)
    {
            int n=7;

            int dp[] = new int[n+1];
            Arrays.fill(dp , -1);

            System.out.println(" Using the MEMOIZATION APPROACH ");
            System.out.println(fibM(n, dp));
            System.out.println("\nUSING THE TABULAR APPROACH");
            System.out.println(fibT(n));

    }

}
