public class FlowerPlacing {

    public static  boolean isFlowerPlaced(int arr[] , int n)
    {
        if(n==0)
        {
            return  true;
        }

        for(int i=0 ; i<arr.length;i++)
        {

            if(arr[i]==0) {
                boolean isLeftEmpty = i == 0 || (arr[i - 1] == 0);
                //System.out.println(isLeftEmpty);
                boolean isRightEmpty =  arr.length-1==0 || (arr[i+1] == 0);

                if(isLeftEmpty && isRightEmpty)
                {
                    n--;
                    arr[i]=1;

                    if(n==0)
                    {
                        return  true;
                    }
                    i++;

                }


            }
        }

               return  n==0;
    }


    public static void main(String[] args) {
        int arr[]= {1,0,1,0,1};
                int n = 1;
        System.out.println(isFlowerPlaced(arr,n));

    }

}
