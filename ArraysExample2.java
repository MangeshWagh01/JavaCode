import java.util.HashMap;
import java.util.Map;

public class ArraysExample2
{

    public  static  void numberOfOccurences(int arr[])
    {
        Map<Integer, Integer> map = new HashMap<>();

        for(int num : arr)
        {
            if(map.containsKey(num))
            {
                map.put(num , map.get(num)+1);
            }
            else {
                map.put(num, 1);
            }
        }

        for(Map.Entry<Integer,Integer>list : map.entrySet())
                {
                    System.out.println("Number = " + list.getKey() + " Occured by  = "+ list.getValue()+ " times ");
                }


        for(Map.Entry<Integer , Integer> list2 : map.entrySet())
        {
            if(list2.getValue()==1)
            {
                System.out.print(list2.getKey() +", ");
            }

        }


    }


   // Kadene's Algorithm's
    public  static  void maximumSubArray(int arr[]) {
        //   {-2,1,-3,4,-1,2,1,-5,4};

        int maxSum = Integer.MIN_VALUE;
        int sum =0;

         // in case in the Q has find the subarray also then use start and end;
        int start=0;
        int ansStart=0 ;
        int ansEnd=0;

        for (int i = 0; i < arr.length; i++)
        {
            if(sum == 0)
            {
                 start = i;
            }

            sum = sum+arr[i];

            if(sum > maxSum)
            {
                maxSum = sum;
                ansStart = start ;
                ansEnd = i;
            }

            if(sum < 0)
            {
                sum = 0;
            }

        }
        System.out.println("Maximum Sum = " + maxSum);
        System.out.println("Start form = " + ansStart + " to  end = "+ ansEnd);
        for (int i = ansStart ; i<=ansEnd ; i++)
        {
            System.out.print(arr[i] + ", ");
        }
    }


    // LC =1

    public  static void twoSum(int arr[] ,int target)
    {
        // Brute Force Soluion

//        for(int i = 0 ; i  <arr.length; i++)
//        {
//            for(int j= i+1 ; j<arr.length ; j++)
//            {
//                if(arr[i]+arr[j]==target)
//                {
//                    System.out.println( i+ " , "+j );
//                }
//
//            }
//
//        }

        // Bettter Solution - Using hashMap

        Map<Integer , Integer> map = new HashMap<>();
        for(int i = 0 ;i<arr.length ; i++)
        {
            int req = target - arr[i];
          if(map.containsKey(req))
          {
              //System.out.println(i);
              System.out.println(req + " , "+ arr[i]);
              System.out.println(  map.get(req)  + " , "  +i);
              //System.out.println("yes");
          }
            map.put(arr[i] , i);
        }
    }


    public static  void buyAndSellStock(int arr[])
        // Using the 2 Loop
//    {
//        int maxProf = 0;
//        int n = arr.length;
//
//        for(int i = 0 ; i< n ; i++)
//        {
//            for(int j = i+1 ;j<n ; j++)
//            {
//                int sub = arr[j]-arr[i];
//                maxProf = Math.max(maxProf , sub);
//            }
//
//        }
//        System.out.println(maxProf);
//
//    }
    {
        int minValue = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i= 0; i<arr.length;i++)
        {
            minValue = Math.min(minValue, arr[i]);
            maxProfit = Math.max(maxProfit , arr[i]-minValue);
        }
        System.out.println(maxProfit);
    }

    public static  void occurencesesInArray(int arr[])
    {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++)
        {
            if(map.containsKey(arr[i]))
            {
                map.put(arr[i],map.get(arr[i])+1);
            }
            else {
                map.put(arr[i], 1);
            }
            }

//        for(int num : arr)
//        {
//
//            if(map.containsKey(num))
//            {
//                map.put(num, map.get(num)+1);
//            }
//            else {
//                map.put(num, 1);
//            }
//        }


        for(Map.Entry<Integer, Integer> list : map.entrySet())
        {
            System.out.println(list.getKey() +" ,"+list.getValue());
        }

    }

    // Main Method's
    public static void main1(String[] args)
    {
        int arr[]= {2,2,4,5,6,7,8,6,5,4,3,2,4,5,6,7,8};
        numberOfOccurences(arr);
    }

    public static void main2(String[] args)
    {

        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        maximumSubArray(arr);
    }

    public static void main3(String[] args) {
        int arr[]= {3,2,4,3,5,6,20,30};
        int target = 50;
        twoSum(arr , target);
    }

    public static void main4(String[] args) {
        int arr[] = {7,1,5,3,6,4};
        buyAndSellStock(arr);
    }

    public static void main(String[] args) {
        int arr[] = {1,1,3,3,4,5,5,6,6,8,9};
        occurencesesInArray(arr);

    }

}
