package Chapter3;

import java.util.Scanner;
import java.util.Random;

/**
 * Program to flip a nickel and have a user guess the side it lands on
 *
 * @author Matthew Stahel
 */
public class C3_14 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String guess, coin;
        int coinFlip;
        System.out.print("I'm going to flip a nickel, what side do you think it is going to land on? (Capitalize first letter) ");
        guess = input.next();
        System.out.print("\n");
        if (guess.equals("Heads") || guess.equals("Tails")) {
            Random randNumber = new Random(); // 1/6000 chance of landing on its side
            coinFlip = randNumber.nextInt(6000 + 1);
            if (coinFlip % 2 == 0) {
                coin = "Heads";
            } else {
                coin = "Tails";
            }
            if (coinFlip == 0) {
                System.out.println("Call me crazy all you want, but the coin landed on its side.");
            } else if (coin.equals(guess)) {
                System.out.println("It landed on " + coin + ". You get to keep the nickel.");
            } else {
                System.out.println("It landed om " + coin + ". This nickel is ALL mine");
            }
        } else {
            System.out.println("That's not an option.\nYou Lose!");
        }
    }
}
