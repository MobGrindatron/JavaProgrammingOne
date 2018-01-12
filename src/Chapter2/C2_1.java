package Chapter2;
import java.util.Scanner;
/**
 * Program to receive a degree in Celsius and convert it into a degree in Fahrenheit and display it to the console
 * 
 * @author Matthew Stahel
 */
public class C2_1{
    /**
     * Main Method
     * 
     * @param args arguments from command line prompt
     */
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a degree in Celsius: ");
		double celsiusDegree = input.nextDouble();
		double fahrenheitDegree = (9.0/5) * celsiusDegree + 32;
		System.out.println(celsiusDegree + " degree(s) Celsius is " + fahrenheitDegree + " degree(s) Fahrenheit");
	}
}