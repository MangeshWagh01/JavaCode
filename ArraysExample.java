import java.util.*;
import java.util.stream.Collectors;

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


   public static int largestSubArrayWithSumK(int arr[] , int k)
   {
       /*
       // 1st approach TC =O(n2)

       //int sum = 0;
       int len = 0;

       for(int i=0; i<arr.length;i++)
       {
           int s = 0;


               for ( int j = i; j < arr.length; j++)
               {
                   s += arr[j];
                    if(s == k )
                    {
                        len = Math.max(len,j-i+1);
                    }
               }
           }
       return  len;   */



       // 2nd Approach
       int n = arr.length;
       int left=0;
       int right = 0;
       int maxLen = 0;
       int sum = arr[0];

       while(right < n)
       {
            while (left <= right && sum > k)
            {
                sum -= arr[left];
                left++;
            }

            if(sum == k)
            {
                maxLen = Math.max(maxLen , right -left +1);
            }

            right++;

            if(right < n)
            {
                sum += arr[right];
            }
       }

       return  maxLen;
   }

   public static  int fibonacciNumber(int n)
   {
       int a1 = 0;
       int a2 = 1;
       int temp = 0;


       for(int i=2; i<=n ; i++)
       {
            temp = a1 + a2;
           System.out.println("a1 = "+a1 + " a2 = "+a2 + " temp = "+temp);

           a1 = a2;
           a2 = temp;
          // System.out.println("a1 = "+a1 + " a2 = "+a2 + " temp = "+temp);
       }
       return temp;
   }

    public static void main1(String[] args)
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

    public static void main2(String[] args)
    {
        int arr[] = {1, 2, -1 ,-2,3,1,1,6};
        int k =3;
        int res=largestSubArrayWithSumK(arr,k);
        System.out.println(res);
    }

    public static void main(String[] args)
    {

        int n = 5;
        System.out.println(fibonacciNumber(n));

        int arr[]  = {2,4,5,6,7,8,9,12,13,15};
       // List<Integer> list2 =new ArrayList<>{2 , 3,2,1,3,43,3,2,34,3,2,53};



       // List<Integer> list= Arrays.stream(arr).boxed().filter(i -> i%2==0).collect(Collectors.toList());
        System.out.println("new List");
          Arrays.stream(arr).boxed().filter(i -> i%2 == 0).collect(Collectors.toList()).forEach(i -> System.out.print(i + " , "));
      //  System.out.println(list);
        System.out.println("Index of hash value = ");
        System.out.println(412&10);
    }
}
