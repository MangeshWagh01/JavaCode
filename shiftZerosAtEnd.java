public class shiftZerosAtEnd {

    public static void main(String[] args) {
        int arr[] ={1,0,3,0,5,0,2};
        int arr2[] = new int[arr.length];
        int j=0;
        for(int i=0 ; i<arr.length;i++)
        {
            if(arr[i] != 0)
            {
                arr2[j++]= arr[i];
            }
        }

        for(int i=0 ; i<arr2.length;i++)
        {
            System.out.print(arr2[i] + ", ");
        }


    }


}
