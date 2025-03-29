public class SubArraySumEqual
{
    //Problem Statement:
    //Find the total number of subarrays of length 3 in a given
    // array where the sum of the first and last element
    // equals the middle element.

    public static void main(String[] args)
    {
        //int arr[] ={ 1,2,1,3,5,2,4,2,6,7,1};
        //int arr[] ={ 2, 4, 2, 6, 3, 7};
        int arr[] ={ 1, 2, 1, 3, 6, 3, 4, 2, 4};
        int cnt=0;

        for(int i=0 ; i<arr.length-2 ;i++)
        {
            for(int j=i ; j<i+3 ; j++)
            {
                int sum = arr[i]+(arr[i+2]);
             //   System.out.println("sum "+sum);
                if(arr[i+1] == sum)
                {
                    cnt++;
                    break;
                }

            }

        }

        System.out.println("count "+cnt);
    }

}
