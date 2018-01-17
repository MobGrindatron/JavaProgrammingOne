package Chapter2;

import java.util.Scanner;

/**
 * Program to calculate and display the total cost of a meal to the console
 *
 * @author Matthew Stahel
 */
public class P2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double mealCost, drinkCost, dessertCost, tax, tip, priceWOTax, total;
        final double TAX_RATE = 0.1, TIP_PERCENT = 0.15;
        System.out.print("How much was your meal? ");
        mealCost = input.nextDouble();
        System.out.print("How much was your drink? ");
        drinkCost = input.nextDouble();
        System.out.print("Finally, how much was your dessert? ");
        dessertCost = input.nextDouble();
        priceWOTax = (int) ((mealCost + drinkCost + dessertCost) * 100) / 100.0;
        tax = (int) (priceWOTax * TAX_RATE * 100) / 100.0;
        tip = (int) ((priceWOTax + tax) * TIP_PERCENT * 100) / 100.0;
        total = priceWOTax + tax + tip;
        System.out.println("What you just ate costs $" + priceWOTax
                + "\nBecause of the Law, there is a tax of $" + tax + " on the food."
                + "\nYou decide to leave a $" + tip + " because you are a nice person."
                + "\nYou are now $" + total + " poorer.");
    }
}
