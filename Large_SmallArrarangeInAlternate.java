import java.util.Arrays;

public class Large_SmallArrarangeInAlternate
{
    public static  void findLarge_Small(int arr[])
    {
        int temp[] = new int[arr.length];

        int first=0;
        int last =arr.length-1;
        Arrays.sort(arr);
        int idx=0;

        while (first < last)
        {
            temp[idx++] = arr[last];
            temp[idx++] = arr[first];
            last--;
            first++;
        }

        System.out.println(Arrays.toString(temp));



    }

    public static  void OptimalApproach(int arr[])
    {
        int minIdx = 0;
        int maxIdx = arr.length-1;
        int max = arr[maxIdx]+1;

        for(int i=0 ; i< arr.length; i++)
        {
            if(i % 2 == 0)
            {
                arr[i] = arr[i] + (arr[maxIdx] % max) * max;
                maxIdx--;
            }
            else
            {
                arr[i] = arr[i] + (arr[minIdx] % max) * max;
                minIdx++;
            }
        }

        System.out.println(Arrays.toString(arr));

        for(int i = 0 ; i<arr.length; i++)
        {
            arr[i] /= max;
        }
        System.out.println(Arrays.toString(arr));

    }


    public static void main(String[] args) {
        int arr[]= { 1, 2, 3, 4, 5, 6};
       // findLarge_Small(arr);
        OptimalApproach(arr);
    }

}
