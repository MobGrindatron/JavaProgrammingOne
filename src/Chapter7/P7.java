package Chapter7;

import java.util.Scanner;

/**
 * Program to take a list, display the list, and display the average of the list
 *
 * @author Matthew Stahel
 */
public class P7 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int l;
        do {
            System.out.print("How long is your list? ");
            l = input.nextInt();
            if (l == 0) {
                System.out.println("You didn't enter the magic number D:");
            }
        } while (l == 0);
        int[] list = new int[l];
        FillList(list);
        double average = Average(list);
        System.out.println("Average: " + average);
        DisplayArray(list);
    }

    /**
     * FillList Method
     *
     * @param list empty list
     */
    public static void FillList(int[] list) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter " + list.length + " Integers: ");
        for (int x = 0; x < list.length; ++x) {
            list[x] = input.nextInt();
        }
    }

    /**
     * Average Method
     *
     * @param list list with numbers
     * @return average number of list
     */
    public static double Average(int[] list) {
        double average;
        double tot = 0.0;
        for (int x = 0; x < list.length; ++x) {
            tot += list[x];
        }
        average = tot / list.length;
        return average;
    }

    /**
     * DisplayArray Method
     *
     * @param list array that gets displayed to he console
     */
    public static void DisplayArray(int[] list) {
        System.out.print("Your list:");
        for (int x = 0; x < list.length; ++x) {
            System.out.print(" " + list[x]);
        }
        System.out.println();
    }
}
