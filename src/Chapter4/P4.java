package Chapter4;
import java.util.Scanner;
/**
 * Program that receives info about 2 people and displays the better offer to
 * the console
 *
 * @author Matthew Stahel
 */


public class P4 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] names = new String[2];
        int m = 0;
        int[] hours = new int[2];
        double[] pay = new double[2], cost = new double[2];
        for (int x = 0; x < 2; ++x) {
            System.out.print("Who is bidder #" + (x + 1) + "? ");
            names[x] = input.next();
            System.out.print("How much free time does " + names[x] + " have? ");
            hours[x] = input.nextInt();
            if (hours[x] == 0) {
                System.out.println(names[x] + " is too busy to work.");
                System.exit(0);
            }
            System.out.print("What is his/her profit? ");
            pay[x] = input.nextDouble();
            if (pay[x] == 0) {
                System.out.println(names[x] + " is a volunteer.");
                System.exit(0);
            }
            cost[x] = pay[x] * hours[x];
        }
        if (cost[0] == cost[1]) {
            if (hours[0] == hours[1]) {
                System.out.println("Let's flip for he job...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
                System.out.println("Dangit! It landed on its side.");
                System.out.println("Hours for both: " + hours[1] + "\nPrice for Both: " + pay[0] + "\nTotal Cost: " + cost[1]);
                System.exit(0);
            } else if (hours[0] < hours[1]) {
                System.out.println(names[0] + " has a new boss.");
                m = 0;
            } else {
                System.out.println(names[1] + "has a new boss.");
                m = 1;
            }
            System.out.println(names[m] + " works for " + hours[m] + " hours.");
        } else if (cost[0] > cost[1]) {
            System.out.println(names[1] + " has a new boss.");
            m = 1;
        } else {
            System.out.println(names[0] + " has a new boss.");
            m = 0;
        }
        System.out.printf("%s will only take $%.2f out of my pocket.", names[m], cost[m]);
    }
}
