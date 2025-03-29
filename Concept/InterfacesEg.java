package Concept;

interface  payment
{


    void pay( int amt);

    // default method

    default  void showTransaction()
    {
        System.out.println("Transaction Details Are Displayed...");
    }

   public static  void printTrasaction()
    {
        System.out.println("Printing the transaction....");
    }

}

interface receipt
{
    void rec();
}

class creditCard implements  payment , receipt
{
    @Override

    public void pay(int amt)
    {
        System.out.println("Paid "+amt + "Creadited");
    }


    @Override
    public void rec() {

    }
}





public class InterfacesEg
{
    public static void main(String[] args) {
        creditCard c = new creditCard();
        c.pay(200);
        System.out.println();
        c.showTransaction();
        System.out.println();
        payment.printTrasaction();
    }

}

