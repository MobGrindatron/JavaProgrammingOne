package Chapter3;

import java.util.Scanner;

/**
 * Program that compares the weight and price of 2 packages and displays the
 * better ndeal
 *
 * @author Matthew Stahel
 */
public class C3_33 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double price1, price2, averagePrice1, averagePrice2;
        int weight1, weight2;
        System.out.print("Enter weight and price for package 1: ");
        weight1 = input.nextInt();
        price1 = input.nextDouble();
        System.out.print("Enter weight and price for package 2: ");
        weight2 = input.nextInt();
        price2 = input.nextDouble();
        averagePrice1 = price1 / weight1;
        averagePrice2 = price2 / weight2;
        if (averagePrice1 < averagePrice2) {
            System.out.println("Package 1 is a better deal");
        } else if (averagePrice2 < averagePrice1) {
            System.out.println("Package 2 is a better deal");
        } else {
            System.out.println("Both Packages are worth the same");
        }
    }
}
