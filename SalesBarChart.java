package Labs.Week_1.scr;

import java.util.Scanner; 

public class SalesBarChart {
    public static void main(String[] args) {
        int stores, sales;
        String Ast = "";

        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter number of stores: ");
        stores = userInput.nextInt();

        for (int i = 0; i < stores; i++) {
            System.out.println("Enter today's sales for store: " + (i+1));

            sales = userInput.nextInt();
            sales = sales / 100;

            Ast = Ast + "Store " + (i+1) + ":";

            for (int j = 0; j < sales; j++) {
                Ast = Ast + "*";
            }
            Ast = Ast + " \n";
        }
    System.out.println(Ast);
    }
}