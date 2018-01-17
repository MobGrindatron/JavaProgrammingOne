package Chapter4;

import java.util.Scanner;

/**
 * Program that searches for 1 string in the other and displays the results to
 * the console
 *
 * @author Matthew Stahel
 */
public class C4_22 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str1 = input.nextLine();
        System.out.print("Enter another string: ");
        String str2 = input.nextLine();
        if (str1.contains(str2)) {
            System.out.println(str1 + " contains " + str2);
        } else {
            System.out.println("Insert something saying that " + str1 + " doesn't have " + str2);
        }
    }
}
