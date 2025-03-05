package LinkedList;

public class LinkedLIstImpl
{
    Node head ;

    public LinkedLIstImpl()
    {
        head = null;
    }

    public boolean insert(int data)
    {
            Node newNode = new Node(data);

            if(head == null)
            {
                head = newNode;
                return  true;
            }
            Node temp = head;

            while (temp.getNext() != null)
            {
                temp = temp.getNext();
            }
            temp.setNext(newNode);
            return  true;
    }

    public  boolean insertAtPosition(int pos , int data)
    {
        if(pos < 1)
        {
            System.out.println("Invalid Position ");
            return  false;
        }

        Node newNode = new Node(data);

        if(pos == 1)
        {
            newNode.setNext(head);
            head = newNode;
            //head =newNode;
            return true;
        }

        Node temp = head;
        if(pos ==1 )
        {
            head = newNode;
            head.setNext(temp);
            return true;
        }
        return false;
    }

    public void Display()
    {

        Node temp = head;

        while (temp != null)
        {
            System.out.println(temp.getData() +" -> " );

            temp= temp.getNext();
        }
        System.out.println("null");
    }



}
