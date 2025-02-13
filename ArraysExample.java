import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class ArraysExample
{
    //1. Combine two array in one sorted Array
//    static void sortedList(int arr1[] , int arr2[])
//    {
//        int n = arr1.length;
//        int m = arr2.length;
//        int arr[] = new int[m+n];
//        int sum = m+n;
//        int j=0;
//        int i =0;
//        int idx = 0;
//
//     //  while(idx < sum)
//        while(i < n || j <m)
//        {
//            if (i < n && j < m) {
//                if (arr1[i] <= arr2[j]) {
//                    arr[idx++] = arr1[i];
//                    i++;
//                } else {
//                    arr[idx++] = arr2[j];
//                    j++;
//                }
//            } else if (i < n) {
//                arr[idx++] = arr1[i];
//                i++;
//            } else {
//                arr[idx++] = arr2[j++];
//                j++;
//            }
//        }
//
//        for(int num:arr)
//        {
//            System.out.print(num + " ");
//        }
//    }


    public static void RemoveDuplicateElement(int arr[])
    {
//        // 1 st Approach For the
//        Set<Integer> list = new TreeSet<>();
//        //int temp[]= new int[2];
//        for(int i = 0; i<arr.length; i++)
//        {
//
//            list.add(arr[i]);
//        }
//
//        for(int num : list)
//        {
//            System.out.print(num +", ");
//        }
//
        // **************************************************

        int temp[] = new int[arr.length];
        int j=0;

        for(int i=0 ; i<arr.length-1;i++)
        {
            if(arr[i]!= arr[i+1])
            {
                temp[j++] = arr[i];
            }

        }
        temp[j++]= arr[arr.length-1];

        for(int i=0 ; i<j ; i++)
        {

            System.out.print(temp[i]+", ");

        }
    }

    public  static void findMissingNumber(int arr[])
    {
        int j = 1;
        for(int i=0 ; i<arr.length ; i++)
        {
            if(arr[i] != j )
            {
                System.out.println(j);
                break;

            }
            j++;

        }

    }

    public  static void findConsecutiveOnes(int arr[])
    {
        int cnt = 0;
        int max = 0;

        for(int i = 0 ; i<arr.length ; i++)
        {
            if(arr[i]==1)
            {
             cnt++;
                max = Math.max(max , cnt);
            }
            else
            {
                cnt = 0;
            }


        }

        System.out.println("Maximum 1 Consecutive is =  "+ max);
    }


   public static void findNumberOccureOnce(int arr[])
   {

       // brute Force
       int n = arr.length;

       for(int i= 0 ; i<n ; i++)
       {
           int cnt = 0;

           for(int j=0; j<n ; j++)
           {
               if(arr[i]==arr[j])
               {
                   cnt++;
               }
           }
           if(cnt==1)
           {
               System.out.println(" Unique Number is = "+ arr[i]);
           }

       }



       // Optimise Approach

//       int xors= 0;
//       for(int i =0 ; i <arr.length;i++)
//       {
//           xors = xors^arr[i];
//       }
//       System.out.println(xors);

   }

    public static void main(String[] args)
    {
        // 1
//        int arr1[] = {2,3,5};
//        int arr2[] = {1,5};
//        sortedList(arr1 , arr2);

//        int arr[]= {2,2,3,3,4,5,5};
//        RemoveDuplicateElement(arr);


        // *****************************************
        // 2
        //int arr[] = {1,2,3,4,5};
        //int arr[] = {1,3};
        //findMissingNumber(arr);



        //*****************************************

//        int arr[] = {1,0,1,1,0,1};
//        int arr[] = { 1, 1, 0, 1, 1, 1 };
//        findConsecutiveOnes(arr);


        //*****************************************
            int  arr[] = {4,1,4,2,1,2,5};
            findNumberOccureOnce(arr);


    }
}
