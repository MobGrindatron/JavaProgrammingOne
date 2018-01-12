package Chapter4;
import java.util.Scanner;
/**
 * Program receives two characters and displays the users subject and year to the console
 * @author Matthew Stahel
 */
public class C4_18{
    /**
     * Main Method
     * 
     * @param args arguments from command line prompt
     */
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		char major;
		int year;
		String string;
		System.out.print("Enter two characters: ");
		string = input.next();
		if(string.length() != 2){
			System.out.println("You are not safe at Francis Tuttle");
			System.exit(0);
		}
		major = string.charAt(0);
		year = string.charAt(1);
		if(major == 'm' || major == 'M')
			string = "Mathematics ";
		else if(major == 'c' || major == 'C')
			string = "Computer Science ";
		else if(major == 'i' || major == 'I')
			string = "Information Technology ";
		else{
			System.out.println("You are not safe at Francis Tuttle");
			System.exit(0);
		}
		switch(year){
			case '1': string += "Freshman";
				break;
			case '2': string += "Sophmore";
				break;
			case '3': string += "Junior";
				break;
			case '4': string += "Senior";
				break;
			default: string = "You are still not safe at Francis Tuttle";
				break;
				
		}
		System.out.println(string);
	}
}