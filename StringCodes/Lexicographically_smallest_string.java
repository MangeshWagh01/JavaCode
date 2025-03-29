package StringCodes;

public class Lexicographically_smallest_string
{

    public  static  String findLaxicographicalStr(String str , char c)
    {

        for(int i= 0 ; i<str.length();i++) {
            String temp = "";
            if (str.charAt(i) > c) {
                temp = str.substring(0, i);
                temp += c;
                temp += str.substring(i, str.length());
                return temp;
            }
        }

        str +=c;

        return str;
    }

    public static void main(String[] args)
    {
        //String s = "acde";
        String s = "adcd";
        char  c = 'e';
        System.out.println(findLaxicographicalStr(s,c));


    }
}
