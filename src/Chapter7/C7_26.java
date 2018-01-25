package Chapter7;

import java.util.Scanner;

/**
 * Program to determine whether 2 lists are the same
 *
 * @author Matthew Stahel
 */
public class C7_26 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        int[] list1 = new int[10];
        int[] list2 = new int[10];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 numbers: ");
        for (int x = 0; x < 10; ++x) {
            list1[x] = input.nextInt();
        }
        System.out.print("Enter " + 10 + " numbers: ");
        for (int x = 0; x < 10; ++x) {
            list2[x] = input.nextInt();
        }
        if (Equals(list1, list2)) {
            System.out.println("They are strictly identical");
        } else {
            System.out.println("They are NOT strictly identical");
        }
    }

    /**
     * Equals Method
     *
     * @param list1 numbers in list 1
     * @param list2 numbers in list 2
     * @return true if the lists are the same
     */
    public static boolean Equals(int[] list1, int[] list2) {
        for (int x = 0; x < 10; ++x) {
            if (list1[x] != list2[x]) {
                return false;
            }
        }
        return true;
    }
}
