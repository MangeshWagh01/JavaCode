package DP;

import java.util.ArrayList;
import java.util.List;

public class RecursionOnSubsequences
{
    static  int cnt =0;
    public static void print1(int idx , List<Integer>list ,int arr[] , int n )
    {

        if(idx == n )
        {
            for(int l : list)
            {
                cnt++;
                System.out.print(l + " ");
            }
            if(list.size()==0)
            {
                System.out.println("");
            }
            System.out.println();
            return;
        }

        list.add(arr[idx]);
        print1(idx+1,list,arr,n);

        list.remove(list.size()-1);

        print1(idx+1 , list , arr ,n);

    }


    public static void main(String[] args) {
        int arr[] = {3,1,2};
        int n=3;

        List<Integer> list = new ArrayList<>();
        print1(0, list , arr , n);
        System.out.println("count" + cnt);

    }
}
