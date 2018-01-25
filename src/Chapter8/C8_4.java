package Chapter8;

/**
 * Program o sort a given list and display the total hours each employee worked
 * for
 *
 * @author Matthew Stahel
 */
public class C8_4 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        int[][] hours = {
            {2, 4, 3, 4, 5, 8, 8},
            {7, 3, 4, 3, 3, 4, 4},
            {3, 3, 4, 3, 3, 2, 2},
            {9, 3, 4, 7, 3, 2, 2},
            {3, 5, 4, 3, 6, 3, 8},
            {3, 4, 4, 6, 3, 4, 4},
            {3, 7, 4, 8, 3, 8, 4},
            {6, 3, 5, 9, 2, 7, 9}
        };
        System.out.println();
        int[] totHours = new int[8];
        int[] displayOrder = {-1, -1, -1, -1, -1, -1, -1, -1};
        for (int x = 0; x < hours.length; ++x) {
            int tot = 0;
            for (int y = 0; y < hours[x].length; ++y) {
                tot += hours[x][y];
            }
            totHours[x] = tot;
        }
        int most = totHours[0], index = 0, o = 0;
        for (int x = 0; x < totHours.length; ++x) {
            for (int y = 0; y < totHours.length; ++y) {
                if (totHours[y] > most && !Contains(displayOrder, y)) {
                    most = totHours[y];
                    index = y;
                }
            }
            displayOrder[o] = index;
            ++o;
            most = 0;
        }
        DisplayTable(hours, totHours);
        System.out.println();
        for (int x = 0; x < displayOrder.length; ++x) {
            System.out.println("Employee #" + displayOrder[x] + ": " + totHours[displayOrder[x]]);
        }
    }

    /**
     * Contains Method
     *
     * @param array array being searched
     * @param number number being searched for
     * @return whether the array has the number
     */
    public static boolean Contains(int[] array, int number) {
        for (int x = 0; x < array.length; ++x) {
            if (array[x] == number) {
                return true;
            }
        }
        return false;
    }

    /**
     * DisplayTable Method
     *
     * @param hours array with all the hours for each worker and day
     * @param totHours array of the total hours worked
     */
    public static void DisplayTable(int[][] hours, int[] totHours) {
        System.out.println("           Su M T W Th F Sa Tot");
        for (int x = 0; x < hours.length; ++x) {
            System.out.print("Employee" + x + ": ");
            for (int y = 0; y <= hours[0].length; ++y) {
                if (y == 0 || y == 6 || y == 4) {
                    System.out.print(hours[x][y] + "  ");
                } else if (y == 7) {
                    System.out.print(totHours[x]);
                } else {
                    System.out.print(hours[x][y] + " ");
                }
            }
            System.out.println();
        }
    }
}
