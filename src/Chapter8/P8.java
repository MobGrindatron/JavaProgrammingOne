package Chapter8;

import java.util.Scanner;

/**
 * Program to store sales of each salesman on each day and display the table to
 * the console when user is finished entering data
 *
 * @author Matthew Stahel
 */
public class P8 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] sales = new double[4][5];
        String reply;
        int worker = -1, day = -1;
        double money;
        String[] validIDs = {"A", "B", "C", "D"}, validDays = {"M", "T", "W", "H", "F"};
        do {
            do {
                System.out.print("Enter the salesman ID as \"A\", \"B\", \"C\", or \"D\": ");
                reply = input.next();
                if (IsInvalid(validIDs, reply)) {
                    System.out.println("INVALID");
                } else {
                    worker = Index(validIDs, reply);
                }
            } while (IsInvalid(validIDs, reply));
            do {
                System.out.print("Ener the day as \"M\", \"T\", \"W\", \"H\", or \"F\": ");
                reply = input.next();
                if (IsInvalid(validDays, reply)) {
                    System.out.println("INVALID");
                } else {
                    day = Index(validDays, reply);
                }
            } while (IsInvalid(validDays, reply));
            System.out.print("How much money did that seller make? ");
            money = input.nextDouble();
            StoreData(sales, worker, day, money);
            do {
                System.out.print("Is that all? (\"Y\" or \"N\"): ");
                reply = input.next();
                if (!(reply.equalsIgnoreCase("Y") || reply.equalsIgnoreCase("N"))) {
                    System.out.println("INVALID");
                }
            } while (!(reply.equalsIgnoreCase("Y") || reply.equalsIgnoreCase("N")));
        } while (reply.equalsIgnoreCase("N"));
        System.out.printf("%12s%6s %6s %6s %6s %6s\n", " ", "M", "T", "W", "H", "F");
        for (int x = 0; x < 4; ++x) {
            switch (x) {
                case 0:
                    System.out.print("Salesman A:");
                    break;
                case 1:
                    System.out.print("Salesman B:");
                    break;
                case 2:
                    System.out.print("Salesman C:");
                    break;
                case 3:
                    System.out.print("Salesman D:");
                    break;
                default:
                    System.out.println("HACKER");
                    System.exit(0);
            }
            for (int y = 0; y < 5; ++y) {
                System.out.printf(" $%5.2f", sales[x][y]);
            }
            System.out.println();
        }
    }

    /**
     * StoreData Method
     *
     * @param sales array being stored
     * @param worker worker index in sales array
     * @param day index of day in sales array
     * @param money value being stored in array
     */
    public static void StoreData(double[][] sales, int worker, int day, double money) {
        sales[worker][day] += money; //clever way of keeping index, I know
    }

    /**
     * IsInvalid Method
     *
     * @param array array being checked
     * @param value string that is being checked for
     * @return whether the array is invalid or valid
     */
    public static boolean IsInvalid(String[] array, String value) {
        for (String string : array) {
            if (value.equalsIgnoreCase(string)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Index
     *
     * @param array valid array
     * @param value index of array
     * @return index number
     */
    public static int Index(String[] array, String value) {
        for (int x = 0; x < array.length; ++x) {
            if (array[x].equalsIgnoreCase(value)) {
                return x;
            }
        }
        return -1;
    }
}
