package ArraysCode;

import java.util.Arrays;
import java.util.HashSet;

public class removeDuplicateFromArray
{
    public  static  int removeDuplicate(int arr[])
    {
        int i = 0;

        for(int j= 1 ; j<arr.length;j++)
        {
            if(arr[j] != arr[i])
            {
                i++;
                arr[i] = arr[j];
            }
        }
        return  i+1;
    }

    public  static  int removeDuplicateUdingSet(int arr[])
    {
        HashSet<Integer> set = new HashSet<>();
        int idx=0;

        for(int i =0 ; i<arr.length;i++)
        {
            if(!set.contains(arr[i]))
            {
                set.add(arr[i]);
                arr[idx++] = arr[i];
            }
        }

        return idx;

    }

    public static void main(String[] args)
    {
        int arr[] = {1,2,3,3,4,4,4,5,5,5,10};
       int k =  removeDuplicate(arr);
      // int k =  removeDuplicateUdingSet(arr);

       for (int i= 0 ; i<k ; i++)
       {
           System.out.print(arr[i] + " ");
       }



    }

}
