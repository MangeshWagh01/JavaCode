import java.util.*;

public class StringExamplePractice
{
        public static  String compressString(String str)
        {
            int cnt = 1;

            StringBuilder sb = new StringBuilder();

            for(int i=1;i<str.length();i++) {
                //char ch = str.charAt(i);
                if (str.charAt(i) == str.charAt(i - 1)) {
                    cnt++;
                } else {
                    if (cnt > 1) {
                        sb.append(cnt);
                    }
                    sb.append(str.charAt(i - 1));
                    cnt = 1;
                }
            }
                if(cnt >1)
                {
                    sb.append(cnt);
                }
                sb.append(str.charAt(str.length()-1));
            
            return  sb.toString();
        }


        public static String checkPalindrome(String str)
        {
            String s = str.toLowerCase().replaceAll("[^A-Za-z]","");
            int n = s.length();

            for(int i=0 ; i<n/2 ; i++)
            {
                if(s.charAt(i) != s.charAt(n-1-i))
                {
                    return  "String is Not Palindrome  "+s;
                }

            }
            return  "String is Pallindrome";
        }

        public  static  void removeDuplicate(int arr[])
        {
            // Without using the another array
            int idx= 0;

            int uniqueArr[]= Arrays.stream(arr).distinct().toArray();
            int uniqueArr1[] = Arrays.stream(arr).toArray();
            System.out.println("filter"+Arrays.toString(uniqueArr1));

            System.out.println("unique array = "+ Arrays.toString(uniqueArr));

            for(int i=0 ; i<arr.length;i++)
            {
                if(arr[i]!=arr[idx])
                {
                    arr[idx++]=arr[i];
                }
            }

            for(int i = 0 ;i<idx;i++)
            {
                System.out.print(arr[i]+ ", ");
            }
            System.out.println("\n\n**********");

            //*************** Using the collectios *********************
            Set<Integer> s = new TreeSet<>();
            for(int i=0; i<arr.length ; i++)
            {
                s.add(arr[i]);
            }
            System.out.println("new treeset = "+s.toString());



            // *****************  Using another array  ***************************
            int j=0;
            int temp[] =new int[arr.length];
             for(int i=0 ; i<arr.length-1;i++)
             {
                 if(arr[i]!= arr[i+1])
                 {
                     temp[j++] =arr[i];
                 }

             }
             temp[j++]= arr[arr.length-1];

            //System.out.println(Arrays.toString(temp));

             for(int i=0 ; i<j;i++)
             {
                 System.out.print(temp[i]+"  ");
             }


        }

    public static void main1(String[] args)
    {
        String str = "aaabcccccff";
        System.out.println(compressString(str));
    }

    public static void main2(String[] args) {
        String str = "m1a2d3a4m555";
        System.out.println(checkPalindrome(str));
    }

    public static void main(String[] args) {
        int arr[]= {1,1,2,3,3,4,4,4,4,4,5,6,7,7,7};
        removeDuplicate(arr);
    }

}
