import java.util.HashSet;
import java.util.Set;

// Cognizant cding questions
// in the string  there are missing character find that missing character and find there
// value according to the array and five the sum of the missing values


public class CharPriceMissing
{
    public  static  int findMissingTicket(int arr[], String str)
    {
        Set<Character> set = new HashSet<>();
        int  res=0;
        for(char c:str.toCharArray())
        {
            set.add(c);
        }

        for(int i=0 ; i<26;i++)
        {
            char ch = (char)('A'+i);

            if(!set.contains(ch))
            {
                res += arr[i];
            }
        }
        return res;
    }

    public static void main(String[] args)
    {
        String str = "ABCDEFGHIJKLMNOPQRSTUVYZ";

        int arr[]= {22,14,4,3,64,3,66,77,45,8,56,34,66,68,24,73,85,7,45,24,98,54,23,64,23,57};

        System.out.println(findMissingTicket(arr,str));

//        System.out.println(arr.length);
//        System.out.println(str.length());

    }


}
