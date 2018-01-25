package Chapter7;

import java.util.Scanner;
import java.io.*;

/**
 * Program that makes another program to determine each students grade
 *
 * @author Matthew Stahel
 */
public class C7_1 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     * @throws Exception to allow the creation of a java file
     */
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in); //So it will wait until number is entered
        int num;
        System.out.print("Enter number of students: ");
        num = input.nextInt();
        int[] grades = new int[num];
        System.out.print("Enter " + num + " score(s): ");
        for (int x = 0; x < num; ++x) {
            grades[x] = input.nextInt();
        }
        System.out.print("Hmmm");
        for (int x = 0; x < 3; ++x) {
            try {
                System.out.print(" .");
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("\nI can't do this!\nI'm going to make a program to do this for me");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        String dir = System.getProperty("user.dir");
        FileWriter file = new FileWriter(dir + "\\RealA71.java");
        BufferedWriter writer = new BufferedWriter(file);
        writer.write("import java.util.Scanner;\n");
        writer.write("public class RealA71{\n");
        writer.write("\tpublic static void main(String[] args){\n");
        writer.write("\t\tScanner input = new Scanner(System.in);\n");
        writer.write("\t\tint num, best = 0;\n");
        writer.write("\t\tSystem.out.print(\"Enter number of students: \");\n");
        writer.write("\t\tnum = input.nextInt();\n");
        writer.write("\t\tint[] grades = new int[num];\n");
        writer.write("\t\tSystem.out.print(\"Enter \" + num + \" scores: \");\n");
        writer.write("\t\tfor(int x = 0; x < num; ++ x){\n");
        writer.write("\t\t\tgrades[x] = input.nextInt();\n");
        writer.write("\t\t\tif(grades[x] > best)\n");
        writer.write("\t\t\t\tbest = grades[x];\n");
        writer.write("\t\t}\n");
        writer.write("\t\tfor(int x = 0; x < num; ++ x){\n");
        writer.write("\t\t\tCharacter let;\n");
        writer.write("\t\t\tif(grades[x] >= best - 10)\n");
        writer.write("\t\t\t\tlet = \'A\';\n\t\t\telse if(grades[x] >= best - 20)\n\t\t\t\tlet = \'B\';\n\t\t\telse if (grades[x] >= best - 30)\n\t\t\t\tlet = \'C\';\n");
        writer.write("\t\t\telse if (grades[x] >= best - 40)\n\t\t\t\tlet = \'D\';\n\t\t\telse\n\t\t\t\tlet = \'F\';\n");
        writer.write("\t\t\tSystem.out.println(\"Student \" + (x + 1) + \" scored a \" + grades[x] + \" and got a(n) \" + let);\n");
        writer.write("\t\t}");
        writer.write("\t}\n}");
        writer.close();
        try {
            Process p = Runtime.getRuntime().exec("javac RealA71.java");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.print("Programming");
        for (int x = 0; x < 3; ++x) {
            try {
                System.out.print(" .");
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.print("\nCompiling");
        for (int x = 0; x < 3; ++x) {
            try {
                System.out.print(" .");
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("\nI have created RealA71 in the same file location as this, so you can run it right now.");
    }
}
