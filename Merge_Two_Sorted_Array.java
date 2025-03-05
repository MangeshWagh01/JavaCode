import java.util.Arrays;

public class Merge_Two_Sorted_Array
{
    public  static  void  mergeArray(int arr1[] , int arr2[] , int n , int m)
    {

        int res[] = new int[m+n];
        int i=0 ;
        int j=0;
        int idx=0;


        while(i < m && j<n)
        {
                if (arr1[i] <= arr2[j]) {
                    //System.out.println("2");
                    res[idx++] = arr1[i];
                    i++;
                }
               else
                {
                    res[idx++] = arr2[j];
                    j++;
                }

        }

        while (i < m)
        {
            res[idx++]=arr1[i++];
        }

        while (j<n)
        {
            res[idx++]= arr2[j++];
        }


        System.out.print(Arrays.toString(res));

    }

    public static void main(String[] args)
    {
        int arr1[]={1,2,7};
        int arr2[]={2,5,6};
        int m=3 ;
        int n=3;
        mergeArray(arr1 ,arr2 , n , m);
    }
}
