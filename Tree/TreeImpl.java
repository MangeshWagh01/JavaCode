package Tree;

import java.util.Stack;

public class TreeImpl
{
        private  Node root;

         public Node getRoot() {
                return root;
            }

        public  TreeImpl()
        {
            root = null;
        }

        public  boolean insert(int data)
        {
            Node newNode  = new Node(data);

            if(root == null)
            {
                root = newNode;
                return  true;
            }

            Node temp = root;

            while(true)
            {
                if(data == temp.getData())
                {
                    return  false;
                }

                if(data < temp.getData())
                {
                    if(temp.getLeft() == null)
                    {
                        temp.setLeft(newNode);
                        return  true;
                    }

                    temp = temp.getLeft();

                }
                else
                {
                    if(temp.getRight() == null)
                    {
                        temp.setRight(newNode);
                        return  true;
                    }
                    temp = temp.getRight();
                }
            }


        }

        public  void  preOrder()
        {
            System.out.println("PreOrder");

            Node temp = root;

            Stack<Node> stack = new Stack<>();

            while (temp != null || !stack.isEmpty()) {
                while (temp != null) {
                    System.out.print(temp.getData()+ " ");
                    stack.push(temp);
                    temp = temp.getLeft();
                }
                temp = stack.pop();
                temp = temp.getRight();
            }
            System.out.println();
        }
}
