import javax.swing.tree.TreeNode;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class LongestPallindromeSubStr
{
    public static boolean isPallindrome(String str ,int i , int j)
    {
        while (i < j)
        {
            char ch1 = str.charAt(i);
            char ch2 = str.charAt(j);

            if(ch1 != ch2)
            {
                return  false;
            }
            i++;
            j--;
        }
        return  true;
    }


    public  static  String  longestPallinSubStr(String str)
    {
        int maxLen = 0;
        int start=0;
        int end=0;

        int n = str.length();
        for(int i = 0 ; i < n ;i++)
        {
            for(int j= i ; j<n; j++)
            {
                if(isPallindrome(str, i, j))
                {
                    if((j-i+1) > maxLen)
                    {
                        maxLen = j-i+1;
                        start=i;
                        end=j;
                    }
                }

            }
        }
        return str.substring(start , end+1);
    }

        public TreeNode constructFromPrePost(int[] preorder, int[] postorder)
        {
            Set<Integer> s = new TreeSet<>();

            for(int i=0 ; i<preorder.length ; i++)
            {
                s.add(preorder[i]);
            }
            for(int j=0 ; j<postorder.length;j++)
            {
                s.add(postorder.length);
            }

            return (TreeNode) s;
        }



    public static void main(String[] args) {
        String str =  "bbabbad";
        System.out.println(longestPallinSubStr(str));

        Set<Integer> s =new TreeSet<>();
        s.add(12);
        s.add(12);
        s.add(11);
        s.add(11);
        s.add(40);
        s.add(5);
        System.out.println(s.toString());


    }
}
