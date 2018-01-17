package Chapter4;

import java.util.Scanner;

/**
 * Program that receive the user's name, wage, work ime, and taxes and
 * calculates his/her paycheck
 *
 * @author Matthew Stahel
 */
public class C4_23 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        int work;
        double pay, ftax, stax;
        System.out.print("What is your name? ");
        name = input.nextLine();
        System.out.print("How many hours have you worked for each week? ");
        work = input.nextInt();
        if (work > (24 * 7)) {
            System.out.println("Show me your time traveling/freezing ways");
            System.exit(1);
        }
        System.out.print("What is your hourly wage? ");
        pay = input.nextDouble();
        System.out.print("What percent of your money goes to Trump? ");
        ftax = input.nextDouble();
        System.out.print("What percent of your money goes to the State? ");
        stax = input.nextDouble();
        System.out.println("Google Seaching Results...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Results\n");
        if (ftax + stax > 1.0) {
            System.out.println("You are in debt");
            System.exit(1);
        } else if (ftax + stax == 1.0) {
            System.out.println("You are not making any money");
            System.exit(1);
        }
        double OPay = work * pay;
        double fTot = OPay * ftax;
        double sTot = OPay * stax;
        double Money = OPay - fTot - sTot;
        System.out.println("Employee Name: " + name);
        System.out.println("Hours Worked: " + work);
        System.out.printf("Pay Rate: $%4.2f\n", pay);
        System.out.printf("Gross Pay: $%4.2f\n", OPay);
        System.out.println("Deductions");
        System.out.printf("  Federal Withholding (%4.2f%s): $$%4.2f\n", (ftax * 100), "%", fTot);
        System.out.printf("  State Withholding (%4.2f%s): $%4.2f\n", (stax * 100), "%", sTot);
        System.out.printf("  Total Deductios: $%4.2f\n", (fTot + sTot));
        System.out.printf("Net Pay: $%4.2f\n", Money);
    }
}
