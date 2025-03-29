import java.util.Arrays;

public class RotateArray
{
    public  static  void rotateArray(int arr[], int n)
    {
        int len = arr.length;

        for(int i=0 ; i<n; i++)
        {
            int first = arr[0];
            for(int j=0; j<len-1; j++)
            {
                arr[j]=arr[j+1];
            }
            arr[len-1] =first;
        }
    }

    public  static  void changeString(String str)
    {
        str = "Mangesh Wagh";
    }
    public static void main(String[] args)
    {
        int arr[] = {1,2,3,4};
        int n = 1;

        System.out.println("Original Array "+Arrays.toString(arr) + " Rotate over "+n+"  Times");
        rotateArray(arr, n);

        System.out.print("Rotated array -  " );
        for(int num :arr)
        {
            System.out.print(num+" ");
        }

    }
}
