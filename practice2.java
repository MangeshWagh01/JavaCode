public class practice2
{
        public  void add(int a , int b)
        {
            System.out.println("1");

            System.out.println(a+b);
        }

        public  void add(double a , double b)
        {
            System.out.println("2");

            System.out.println(a*b);
        }
        public void add(long a , long b)
        {
            System.out.println("3");

            System.out.println(a+b);
        }

        public void add(long a , double b)
        {
            System.out.println("4");
            System.out.println(a+b);
        }


    public static void main1(String[] args)
    {

        practice2 p = new practice2();
      //  p.add(12.1,8.1);
        p.add(1290859544,459845983);


    }

    public static void main2(String[] args)
    {
        practice2 obj1 = new practice2();

        practice2 obj2 = new practice2();
        obj2.add(12,12);
        obj1 = obj2;


        //obj2.add(20,30);

    }



    public  static boolean isAnagram(String s , String t)
    {
        int arr[] = new int[26];

        for(int i=0 ; i<s.length();i++)
        {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

                arr[ch1-'a']++;
                arr[ch2-'a']--;
        }
        for(int c : arr)
        {
            if(c != 0)
            {
                return false;
            }
        }
        return  true;
    }
    public static void main(String[] args)
    {
        String s = "anagram", t = "nagaras";
        System.out.println(isAnagram(s,t));
    }
}
