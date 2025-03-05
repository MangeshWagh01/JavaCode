public class BuyAndSellProblem
{

    public static int buyAndSellStock(int arr[])
    {
        int maxLen =0;

        for(int i=0 ; i<arr.length;i++)
        {
            for(int j=i+1 ; j<arr.length;j++)
            {

                if(arr[i] < arr[j])
                {
                 int len = arr[j] - arr[i];
                 maxLen = Math.max(maxLen , len);

                }

            }
        }

        return maxLen;
    }

    public static int betterBuyAndSell(int arr[])
    {
        int maxLen = 0;
        int j=0;

        for(int i=1 ; i<arr.length-1;i++)
        {
           // j=i+1;

            if(arr[j] < arr[i] )
            {
                int len = arr[i] - arr[j];
                maxLen = Math.max(maxLen , len);
             //   j++;
            }
            else
            {
                //i = j;
                j++;
            }
        }
        return  maxLen;
    }

    public static void main(String[] args)
    {
      //  int arr[]  = {7,1,5,3,6,4};
        int arr[]  = {7,6,4,3,1};
       // System.out.println(buyAndSellStock(arr));
        System.out.println(betterBuyAndSell(arr));

    }

}
