public class Practice2DArray
{


    public static void main(String[] args)
    {
        int arr[][] = {{1,2,3,4,5},{7,8,9,0},{2,42,53,23}};


        System.out.println(arr.length);
        for(int i=0; i<5;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


    }


}
