public class UpdateArrayWithMaxEle
{

    public static void ReplaceByMax(int arr[])
    {
        for(int i=1;i<arr.length ; i++)
        {
            for(int j=i ; j>=0;j--)
            {
                if(arr[i] > arr[j])
                {
                    arr[j]=arr[i];

                }
            }

        }

//        for(int i=0 ; i <arr.length;i++)
//        {
//            System.out.print(arr[i] + ", ");
//        }

        for(int a : arr)
        {
            System.out.print(a + ", ");
        }
    }

    public static void main(String[] args)
    {

        int arr[] = {6, 7, 11, 4, 10, 8 };
        ReplaceByMax(arr);
    }
}
