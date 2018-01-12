package Chapter2;
import java.util.Scanner;
/**
 * Program to receive a subtotal and a gratuity rate and calculate the total
 * @author Matthew Stahel
 */
public class C2_5{
    /**
     * Main Method
     * 
     * @param args arguments from command line prompt
     */
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the subtotal and a gratuity rate: ");
		double subtotal = input.nextDouble(), grat_rate = input.nextDouble() / 100, totalCost;
		double gratAmount = grat_rate * subtotal;
		totalCost = gratAmount + subtotal;
		System.out.println("The gratuity cost is $" + gratAmount + " and total cost is $" + totalCost);
	}
}