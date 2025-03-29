import java.util.Stack;

public class validParenthesis
{
    public  static  boolean isValid(String str)
    {
        Stack<Character>stack = new Stack<>();

        for(int i=0;i<str.length();i++)
        {

            char ch = str.charAt(i);


                if (!stack.isEmpty() && ((stack.peek() == '(' && ch == ')') || (stack.peek() == '{' && ch == '}') || (stack.peek()=='[' && ch == ']')))
                {
                    stack.pop();
                }

            else
            {
                stack.push(ch);
            }
        }
        return  stack.isEmpty();

    }

    public static void main(String[] args) {
        String str = "[{()}]";
        System.out.println(isValid(str));

    }
}
