// Ananth Kashibhatla
// CMP129
// Week 01 Lab 02
// 11 September 2026 
package Labs.Week_1.scr;

import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter number of patterns for A: ");
        int patternsA = userInput.nextInt();

        for (int rowOne = 1; rowOne <= patternsA; rowOne++) {
            for (int columnOne = 1; columnOne <= rowOne; columnOne++) {
                System.out.print("+");
            }
        System.out.println();
        }

        System.out.println("Enter number of patterns for B: ");
        int patternsB = userInput.nextInt();

        for (int rowTwo = 1; rowTwo <= patternsB; rowTwo++) {
            for (int columnTwo = rowTwo; columnTwo <= patternsB; columnTwo++) {
                System.out.print("+");
            }
        System.out.println();
        }
  
    }    
}
