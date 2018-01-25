package Chapter7;

import java.util.Scanner;
import java.util.Arrays;

/**
 * Program to receive a list of numbers and determine the smallest number in the
 * list
 *
 * @author Matthew Stahel
 */
public class C7_9 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];
        System.out.print("Enter 10 numbers: ");
        for (int x = 0; x < 10; ++x) {
            numbers[x] = input.nextDouble();
        }
        Arrays.sort(numbers);
        boolean pi = false;
        for (int x = 0; x < 10; ++x) {
            if (numbers[x] == 3.14) {
                pi = true;
            }
        }
        if (pi) {
            System.out.println("Mmmmmmm Delicious!");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            System.out.println("What flavor was it?");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            System.exit(0);
        }
        System.out.println("The smallest number is " + numbers[0]);
    }
}
