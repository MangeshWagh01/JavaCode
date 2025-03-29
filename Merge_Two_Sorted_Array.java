import java.util.Arrays;

public class Merge_Two_Sorted_Array
{
    // It's Stored in the Anothet Array we want in single array
    public  static  void  mergeArrayInAnotherArray(int arr1[] , int arr2[] , int n , int m)
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


    // Solution - Merge two sorted array and store in the first array
    // that has alredy present dumy items replace it
    // arr1 = [1,2,3,0,0,0];
    // arr2 = [2,5,6];

    public  static  void mergeArray(int arr1[] ,int n , int arr2[] , int m)
    {
        int i = n-1;
        int j = m-1;
        int k = n+m-1;

        while (i >= 0 && j >= 0)
        {
            if(arr1[i] > arr2[j])
            {
                arr1[k--] = arr1[i--];
            }
            else {
                arr1[k--] = arr2[j--];
            }
        }

        while(j>=0)
        {
            arr1[k--] = arr2[j--];
        }
    }

    public static void main(String[] args)
    {
        int arr1[] = {1,2,3,0,0,0};
        int arr2[] = {2,5,6};
        int m=3 ;
        int n=3;
        mergeArray(arr1,n,arr2, m);

        for(int x:arr1)
        {
            System.out.print(x+", ");
        }
    }
}
