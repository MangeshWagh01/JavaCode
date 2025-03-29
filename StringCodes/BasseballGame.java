package StringCodes;

import java.util.Stack;

public class BasseballGame
{
        public static int findScore(String ops[])
        {

            Stack<Integer> stack = new Stack<>();

            for(String op : ops) {
                if (op.equals("C")) {
                    if (!stack.isEmpty()) {
                        stack.pop();
                    }
                } else if (op.equals("D")) {
                    if (!stack.isEmpty()) {
                        stack.push(2 * stack.peek());
                    }
                } else if (op.equals("+")) {
                    if (!stack.isEmpty()) {
                        int top = stack.pop();
                        int newTop = top + stack.peek();

                        stack.push(top);
                        stack.push(newTop);
                    }
                } else
                {
                    stack.push(Integer.parseInt(op));
                }
            }

            int sum=0;

            for(int n: stack)
            {
                sum = sum + n;
            }
            return sum;
        }


    public static void main(String[] args)
    {
        String ops[] = {"5" ,"2" , "C" , "D", "+"};

        System.out.println(findScore(ops));

    }

}
