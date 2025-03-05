package Tree;

import com.sun.source.tree.Tree;

public class Main
{

    public static void main(String[] args) {

        TreeImpl  t = new TreeImpl();

        t.insert(50);
        t.insert(60);
        t.insert(55);
        t.insert(70);
        t.insert(65);
        t.insert(30);
        t.insert(10);
        t.insert(40);

        t.preOrder();
       // System.out.println(t.toString());


    }
}
