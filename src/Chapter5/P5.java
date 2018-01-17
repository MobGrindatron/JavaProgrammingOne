package Chapter5;

import java.util.Scanner;

/**
 * Program to count yes and no votes and displays to the console the number of
 * yes and no votes when he user enters "q"
 *
 * @author Matthew Stahel
 */
public class P5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputS = "";
        int yes = 0;
        int no = 0;

        while (!inputS.toLowerCase().equals("q")) {
            inputS = input.nextLine();

            switch (inputS.toLowerCase()) {
                case "y":
                    System.out.println("You have voted yes.");
                    yes++;
                    break;
                case "n":
                    System.out.println("You have voted no.");
                    no++;
                    break;
                case "q":
                    System.out.println("Yes votes: " + yes + "\nNo votes: " + no);
                    break;
                default:
                    System.out.println("INVALID CODE: Enter 'Y' to vote yes, 'N' to vote no, or 'Q' to quit voting");
            }
        }
    }
}
