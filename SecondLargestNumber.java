import java.util.Arrays;

public class SecondLargestNumber {

    public static int secondLarge(int arr[]) {
        int maxNum = Integer.MIN_VALUE;
        int secondMax = 0;
        for (int i = 0; i < arr.length; i++) {
            //if
            //secondMax = maxNum;
            if (maxNum < arr[i]) {
                //secondMax = maxNum;
                maxNum = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++)
        {
            if (secondMax < arr[i] && arr[i] != maxNum) {
                secondMax = arr[i];
            }

        }

            System.out.println("Max = " + maxNum);
            return secondMax;

    }

    public  static  int secondLargeBetter(int arr[])
    {
        int maxNum = -1;
        int secondLarge = -1;

        for(int i=0;i< arr.length;i++)
        {

            if(maxNum < arr[i])
            {
                secondLarge = maxNum;
                maxNum = arr[i];
            }
            else if(secondLarge < arr[i] && arr[i] != maxNum)
            {
                secondLarge=arr[i];
            }

        }
        return secondLarge;

    }

    public static void main(String[] args)
    {
        //int arr[]  = {1,5,6,8,3,2};
       int arr[]  = {12, 35, 1, 10, 34, 1};
        //int arr[]  = {10, 10, 10};
       //
        System.out.println("Second Largest Number = "+ secondLarge(arr));
        System.out.println("Second Largest Number = " + secondLargeBetter(arr));
//        Arrays.sort(arr);
//        System.out.println(arr[arr.length-2]);
//        for(int a :arr)
//        {
//            System.out.print(a +", ");
//        }
    }
}
