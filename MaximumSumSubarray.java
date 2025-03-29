import java.util.Arrays;

public class MaximumSumSubarray
{
    public  static  int findMaxSumInSubArray(int arr[])
    {
            int maxSum = 0;


            for(int i=0 ; i<arr.length;i++) {
                int sum = 0;

                for (int j = i; j < arr.length; j++) {
                    if (sum >= 0) {
                        sum = sum + arr[j];
                        maxSum = Math.max(maxSum, sum);
                    } else {

                        break;
                    }
                }
            }
        return maxSum;
    }

    public  static  int better(int arr[])
    {
        int maxSum = 0;
        int sum = 0;
        int start=0;
        int end =0;

        for(int i=0 ; i<arr.length;i++)
        {

            sum = sum+arr[i];

            if(sum > maxSum)
            {
                end = i;
                maxSum=sum;
            }
            if(sum < 0 )
            {
                sum = 0;
                start = i;
            }

        }
        System.out.println("start "+start);
        System.out.println("end "+end);
        for(int i = start ; i<=end ; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        return  maxSum;
    }

    public static void main(String[] args) {

        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
       // int arr[] = {5,4,-1,7,8};
        //int arr[]= {};
       // System.out.println(findMaxSumInSubArray(arr));
       // System.out.println();
        System.out.println(better(arr));

    }

}
