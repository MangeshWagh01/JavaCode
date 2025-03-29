package Concept;

public class Queue
{
    static  int idx=0;

    public static void insert(int arr[],int n)
    {
       arr[idx++] = n;
    }

    public  static  void  dequeue()
    {

    }

    public static void main(String[] args) {

       Queue q = new Queue();

        int arr[] = new int[4];

        insert(arr,1);
        insert(arr,2);
        insert(arr,4);
        insert(arr,13);






    }

}
