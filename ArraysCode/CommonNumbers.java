package ArraysCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CommonNumbers
{
    public  static  int[] solution(int arr1[] , int arr2[])
    {

        int res[] = new int[arr1.length+arr2.length];
        int idx=0;

        for(int i= 0 ; i<arr1.length;i++)
        {
            for(int j= 0 ; j<arr2.length; j++)
            {
                if(arr1[i] == arr2[j])
                {
                    res[idx++] = arr1[i];
                    break;
                }
            }
        }
        int temp[] = new int[idx];

        for(int i = 0 ; i<idx ; i++)
        {
            temp[i] = res[i];
        }


        System.out.println(Arrays.toString(res));
        return temp;
    }

//    public  static  int[] solution1(int arr1[] , int arr2[])
//    {
//        Map<Integer , Integer > map = new HashMap<>();
//
//        for(int num : arr1)
//        {
//            map.put(num , )
//        }
//
//
//    }

    public static void main(String[] args) {

//        int arr1[] = {12, 11, 11, 12};
//        int arr2[] = {12, 12};

        int arr1[] = { 14,19,15,14};
        int arr2[] = {19,14,19,18,14};


        int res[] = solution(arr1,arr2);
       // Arrays.sort(res);
        System.out.println(Arrays.toString(res));

    }



}
