import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MovieTheatreBill
{
    public static void main(String[] args) throws IOException
    {
        /*
        // Using the Buffer Reader

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(br.readLine());
        String  = br.readLine();
        String n = br.readLine());  */




        // Using The Scanner

        Scanner sc = new Scanner(System.in);

            int pizzzQty= sc.nextInt();
            int puffsQty = sc.nextInt();
            int coodrinksQty = sc.nextInt();

            int amt = (pizzzQty*100) + (puffsQty*20)+(coodrinksQty*10);
            System.out.println(amt);



    }
}
