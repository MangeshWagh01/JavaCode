import java.util.HashMap;
import java.util.Map;

public class RomanNumber
{
    public  static  int romanNum(String str)
    {
        Map<Character , Integer> map = new HashMap<>();

        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);


        int sum=0;
        int preValue=0;

        for(int i = str.length()-1 ; i>=0 ; i--)
        {
            int value = map.get(str.charAt(i));

            if(value < preValue)
            {
                sum = sum - value;
            }
          else
            {
                sum = sum+value;
            }

          preValue =value;
        }
        return  sum;
    }

    public static void main(String[] args) {

      //  String str = "VIII";
        String str = "MCMXCIV";
        System.out.println(romanNum(str));

    }
}
