package Chapter6;

import java.util.Scanner;

/**
 * Program to calculate the amount of euros, pounds, and/or yen the user will
 * get with us dollars
 *
 * @author Matthew Stahel
 */
public class P6 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        ProgramOnOnlyOneLineBecauseIWantToDoThisForFun();
    }

    /**
     * CalcCurrency Method
     *
     * @param amount the amount of cash the user is trading for a currency
     *
     * @param convert the number of currency the user can get with 1 US dollar
     *
     * @return the total amount of the currency bought
     */
    public static double CalcCurrency(double amount, double convert) {
        amount = ApplyTax(amount);
        double currency = amount * convert;
        return currency;
    }

    /**
     * ApplyTax Method
     *
     * @param amount the amount of money the user spent including tax
     *
     * @return the amount of money that gets converted into foreign currency
     */
    public static double ApplyTax(double amount) {
        if (amount > 100.0) {
            amount *= 0.95;
        } else {
            amount *= 0.9;
        }
        return amount;
    }

    /**
     * ProgramOnOnlyOneLineBecauseIWantToDoThisForFun Method
     */
    public static void ProgramOnOnlyOneLineBecauseIWantToDoThisForFun() {
        String check, whle;
        Scanner input = new Scanner(System.in);
        double startCash, convertE, convertP, convertY;
        System.out.print("How many Euros can I get for a dollar? ");
        convertE = input.nextDouble();
        System.out.print("How many Pounds can I get for a dollar? ");
        convertP = input.nextDouble();
        if (convertP > 20) {
            System.out.println("Why do you want to gain weight?");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            System.out.print("Anyways ");
            for (int i = 0; i < 3; ++i) {
                System.out.print(". ");
                try {
                    Thread.sleep(750);
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
            }
            System.out.println();
        }
        System.out.print("How many Yen can I get for a dollar? ");
        convertY = input.nextDouble();
        do {

            System.out.print("How much money are you spending? ");
            startCash = input.nextDouble();
            System.out.print("What type of currency do you want to get? ");
            check = input.next();
            check = check.toUpperCase();
            if (check.equals("E")) {
                System.out.printf("Including tax, you are getting %.2f Euros\n", CalcCurrency(startCash, convertE));
            } else if (check.equals("P")) {
                System.out.printf("Including tax, you are getting %.2f Pounds\n", CalcCurrency(startCash, convertP));
            } else if (check.equals("Y")) {
                System.out.printf("Including tax, you are getting %.2f Yen\n", CalcCurrency(startCash, convertY));
            } else {
                Punishment();
            }
            do {
                System.out.print("Do you need anything else? ");
                whle = input.next();
                if (!(whle.equalsIgnoreCase("No") || whle.equalsIgnoreCase("Yes"))) {
                    System.out.println("You can't do that");
                }
            } while (!(whle.equalsIgnoreCase("No") || whle.equalsIgnoreCase("Yes")));
        } while ((whle.equalsIgnoreCase("Yes")));
    }

    /**
     * Punishment Method
     */
    public static void Punishment() {
        for (int x = 0; x < 25; ++x) {
            for (int y = 0; y < 25; ++y) {
                if (Math.random() >= 0.5) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }

    }
}
