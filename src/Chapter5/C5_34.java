package Chapter5;

import java.util.Scanner;

/**
 * Program to receive the user's choice of rock, paper, or scissors, generates
 * the computer's choice, displays the result to the console, and repeats until
 * either the player or computer wins twice
 *
 * @author Matthew Stahel
 */
public class C5_34 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        int playerWins = 0;
        int compWins = 0;
        int compPlay = 0;
        Scanner input = new Scanner(System.in);
        String inputS;

        System.out.println("   ___           __             \n  / _ \\___  ____/ /__           \n / , _/ _ \\/ __/  '_/           \n/_/|_|\\___/\\__/_/\\_\\            \n  / _ \\___ ____  ___ ____       \n / ___/ _ `/ _ \\/ -_) __/       \n/_/   \\_,_/ .__/\\__/_/          \n   ____  /_/                    \n  / __/___(_)__ ___ ___  _______\n _\\ \\/ __/ (_-<(_-</ _ \\/ __(_-<\n/___/\\__/_/___/___/\\___/_/ /___/\n");

        while (playerWins < 2 && compWins < 2) {
            System.out.println("WINS: " + playerWins + " LOSES: " + compWins);
            System.out.println("Please enter rock, paper, or scissors");
            inputS = input.nextLine();
            compPlay = (int) (Math.random() * 3);
            /*
				0 - rock
				1 - paper
				2 - scissors
             */

            if (inputS.toLowerCase().equals("rock") && compPlay == 0) {
                System.out.println("You tied with rock.");
            } else if (inputS.toLowerCase().equals("paper") && compPlay == 0) {
                System.out.println("You won with paper.");
                playerWins++;
            } else if (inputS.toLowerCase().equals("scissors") && compPlay == 0) {
                System.out.println("You lost with scissors.");
                compWins++;
            } else if (inputS.toLowerCase().equals("rock") && compPlay == 1) {
                System.out.println("You lost with rock.");
                compWins++;
            } else if (inputS.toLowerCase().equals("paper") && compPlay == 1) {
                System.out.println("You tied with paper.");
            } else if (inputS.toLowerCase().equals("scissors") && compPlay == 1) {
                System.out.println("You won with scissors.");
                playerWins++;
            } else if (inputS.toLowerCase().equals("rock") && compPlay == 2) {
                System.out.println("You won with rock.");
                playerWins++;
            } else if (inputS.toLowerCase().equals("paper") && compPlay == 2) {
                System.out.println("You lost with paper.");
                compWins++;
            } else if (inputS.toLowerCase().equals("scissors") && compPlay == 2) {
                System.out.println("You tied with scissors.");
            } else {
                System.out.println("Please enter a valid input");
            }
        }
    }
}
