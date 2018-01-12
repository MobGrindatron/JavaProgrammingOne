package Chapter3;
import java.util.Scanner;
/**
 * Program that takes 2 numbers, compares them, divides the first number over the second, determines if the fraction is proper,
 *     and grades it
 * @author Matthew Stahel
 */
public class P3{
    /**
     * Main Method
     * 
     * @param args arguments from command line prompt
     */
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double number1, number2;
        int grade;
        System.out.print("Enter a number: ");
        number1 = input.nextDouble();
        System.out.print("Enter another number: ");
        number2 = input.nextDouble();
        grade = (int)(number1/10.0);
        if(number1 < number2)
            System.out.println("The first number is less than the second");
        if(number1 > number2)
            System.out.println("The first number is greater than the second");
        if(number1 == number2)
            System.out.println("The first number is equal to the second");
        if(number1 <= number2)
            System.out.println("The first number is less than or equal to the second");
        if(number1 != number2)
            System.out.println("The first number is not equal to the second");
        
        if(number2 == 0)
            System.out.println("Cannot divide by 0");
        else if (number1 / number2 < 1)
            System.out.println("Proper Fraction");
        else
            System.out.println("Imporoper Fraction");
        
        if(number1 >= 90)
            System.out.println("A");
        else{
            switch(grade){
                case 8: System.out.println("B");
                        break;
                case 7: System.out.println("C");
                        break;
                case 6: System.out.println("D");
                        break;
                default: System.out.println("F");
                        break;
            }
        }
        if(number2 >= 1 && number2 <= 100)
            System.out.println("In range");
        else
            System.out.println("Out of range");
    }
}