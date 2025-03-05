import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class StringExample
{
    public static  String removeOuterParenthesis(String str)
    {
        int cnt = 0;
        String  ans = "";

        for( char c : str.toCharArray())
        {
            if(c == ')') cnt--;
            if(cnt != 0)  ans += c;
            if(cnt == '(') cnt++;

        }
        return  ans;

//        int cnt = 0;
//        StringBuilder sb = new StringBuilder();
//
//        for(int i=0; i<str.length(); i++)
//        {
//            char ch = str.charAt(i);
//            if(ch==')')
//            {
//                cnt--;
//            }
//
//            if(cnt != 0)
//            {
//                sb.append(ch);
//            }
//
//            if(ch == '(')
//            {
//                cnt++;
//            }
//        }
//        return sb.toString();
    }

    public  static  String reverseString(String str)
    {
        Stack<String> st = new Stack<>();
        str +=" ";
        String word="";

        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==' ')
            {
                st.push(word);
                System.out.println(word);
                word="";
            }
            else
            {
                word += str.charAt(i);
            }
        }

        String ans = "";
        while (st.size()!=1)
        {
            ans +=st.peek()+ " ";
            //System.out.println(st.peek());
            st.pop();
        }
        ans += st.peek();
        System.out.println("Final Answer = "+ans);
        return  ans;
    }

    public  static  String reverseString1(String str1)
    {
        String word= "";
        String str = " "+str1;
        String ans = "";

        //str +=" ";

        for(int i =str.length()-1 ; i>=0 ; i--)
        {
            if(str.charAt(i)== ' ')
            {
                //word = str.charAt(i)
                ans = ans+" "+word ;
                word="";

            }
            else
            {
                word = str.charAt(i)+word;
            }
        }

        //System.out.println(word);
        System.out.println(ans);


return  ans;
    }


     public  static  void stringMatching(String str[])
     {
         for(int i=0 ; i<str.length ; i++)
         {
            // String  str1 = str[i];
             //String s = "as";
             //System.out.println("contails "+ str1.contains(s));
             for(int j=0 ; j<str.length;j++)
             {
                if(str[i].length() < str[j].length())
                 {
                     //System.out.println(str[i]);
                     if (str[j].contains(str[i])) {
                         //System.out.println("i =" + i + " j = " + j);
                         System.out.print(str[i]+ " ");
                         break;

                     }
                }
             }


         }


     }

     public  static  void removeDuplicateSortededArra(int arr[])
     {
         int idx =0;
         HashMap<Integer , Integer>map = new HashMap<>();

         for(int num : arr)
         {
             if(map.containsKey(num))
             {
                 map.put(num , map.get(num)+1);
             }
             else
             {
                 map.put(num , 1);
             }
         }


         for(Map.Entry<Integer,Integer>list : map.entrySet())
         {
             System.out.println(" num = "+list.getKey()+" , " + "occurence = "+list.getValue());

             if(list.getValue()>=2)
             {
                 arr[idx++]=list.getKey();
                 arr[idx++] = list.getKey();
             }
             else
             {
                 arr[idx++] = list.getKey();
             }
         }
         System.out.println("Arrays = "+Arrays.toString(arr));
         System.out.println("idx = "+idx);
     }

    // Main Methods
    public static void main1(String[] args)
    {
        String str = "()()";
        System.out.println(removeOuterParenthesis(str));
    }

    public static void main2(String[] args) {
        String str = "This is decent";
        System.out.println("Original String  = "+ str);
        System.out.println(reverseString1(str));

        String newStr = "abcd,f,dfdf,aer,esf,es,eleefef";
        //newStr.split(",");
        String s1[] = newStr.split(",");
        for (String s : s1)
        {
            System.out.print(s+"   ");
        }

    }

    public static void main3(String[] args)
    {
        String str[] = {"mass","as","hero","superhero" };
        stringMatching(str);

    }

    public static void main4(String[] args)
    {
        int arr[] = {-3,-1,0,0,0,3,3};
        removeDuplicateSortededArra(arr);
    }

    public static void main(String[] args)
    {
            double otp = Math.random();
        //System.out.println(Math.(otp*10000));
        System.out.println(otp);

    }
}
