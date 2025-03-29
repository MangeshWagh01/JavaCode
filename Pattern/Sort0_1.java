package Pattern;

public class Sort0_1
{
    public  static void printSortedArray(int arr[])
    {
        int left =0;
        int right=0;
        int n = arr.length;
//        for(int r=0 ; r<arr.length;r++)
//        {
//            if(arr[r]==0)
//            {
//                arr[left] = 0;
//                arr[r] = 1;
//                left++;
//            }
//
//        }

        while (right < n)
        {
            if(arr[right] == 0)
            {
                arr[right] = 1;
                arr[left] = 0;

                right++;
                left++;
            }
            else {

                right++;
            }
        }


    }


    public static  void moveAllZeroAtEnd(int arr[])
    {
        int right = 0;
        int left = 0;
        int n = arr.length;

        while (right < n)
        {
            if(arr[right] ==1)
            {
                arr[left] = 1;
                arr[right] =0;
                left++;
                right++;
            }
            else {
                right++;
            }

        }

    }
    public static void main(String[] args)
    {

        //int arr[] = {0,1,1,1,0,0,1,0};
        int arr[] = {1,0,1,1,0,0,0};


    //    printSortedArray(arr);
        moveAllZeroAtEnd(arr);
        for(int n:arr)
        {
            System.out.print(n +" ");
        }

    }

}
