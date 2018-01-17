package Chapter6;

import java.util.Scanner;

/**
 * Program o receive a password and check the requirements have been met for the
 * password to be valid
 *
 * @author Matthew Stahel
 */
public class C6_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String password = input.nextLine();
        if (IsValid(password)) {
            System.out.println("You password is safe with me.");
        } else {
            System.out.println("ERROR 4291: Invalid Password!");
        }
    }

    /**
     * IsValid Method
     *
     * @param password password that has been entered by the user
     *
     * @return whether the requirements have been met
     */
    public static boolean IsValid(String password) {
        int numOfNums = 0;
        for (int x = 0; x < password.length(); ++x) {
            char c = (password.toLowerCase()).charAt(x);
            if (c >= '0' && c <= '9') //If a number
            {
                ++numOfNums;
            } else if (!(c >= 'a' && c <= 'z')) //If Not a Letter
            {
                return false;
            }
        }

        if (numOfNums == password.length()) {
            for (int x = 0; x < 25; ++x) {
                for (int y = 0; y < 25; ++y) {
                    if (Math.random() >= 0.5) {
                        System.out.print("1");
                    } else {
                        System.out.print("0");
                    }
                }
                System.out.println();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
            }
            System.exit(0);
        }
        if (password.length() < 8) {
            return false;
        }
        if (numOfNums >= 2) {
            return true;
        } else {
            return false;
        }
    }
}
