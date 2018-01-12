package Chapter3;
import java.util.Scanner;
/**
 * Program that takes a number and determines if it is divisible by 5 and/or 6
 * @author Matthew Stahel
 */
public class C3_26{
    /**
     * Main Method
     * 
     * @param args arguments from command line prompt
     */
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int something;
		System.out.print("Enter an integer: ");
		something = input.nextInt();
		System.out.println("Is " + something + " divisible by 5 and 6? " + (something % 5 == 0 && something % 6 == 0));
		System.out.println("Is " + something + " divisible by 5 or 6? " + (something % 5 == 0 || something % 6 == 0));
		System.out.println("Is " + something + " divisible by 5 or 6, but not both? " + (something % 5 == 0 ^ something % 6 == 0));
	}
}