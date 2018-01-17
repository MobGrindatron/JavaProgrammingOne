package Chapter5;

import java.util.Scanner;

/**
 * Program to take a user's string and reverse it
 *
 * @author Matthew Stahel
 */
public class C5_46 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();

        StringBuilder sb = new StringBuilder(text);
        System.out.println("The reversed string is " + sb.reverse());
    }
}
