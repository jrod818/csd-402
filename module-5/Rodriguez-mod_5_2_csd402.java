 /*
 * Jose Rodriguez
 * 9/27/26
 * CSD-402 Module 5.2 Assignment
 *
 * This program demonstrates overloaded methods that locate
 * the largest and smallest values in two-dimensional arrays.
 * Each method returns the row and column where the value is located.
 */

public class LocateElements {

    // Returns the location of the largest value in a double array.
    public static int[] locateLargest(double[][] arrayParam) {

        int[] location = {0, 0};
        double largest = arrayParam[0][0];

        for (int row = 0; row < arrayParam.length; row++) {
            for (int column = 0; column < arrayParam[row].length; column++) {

                if (arrayParam[row][column] > largest) {
                    largest = arrayParam[row][column];
                    location[0] = row;
                    location[1] = column;
                }
            }
        }

        return location;
    }

    // Returns the location of the largest value in an int array.
    public static int[] locateLargest(int[][] arrayParam) {

        int[] location = {0, 0};
        int largest = arrayParam[0][0];

        for (int row = 0; row < arrayParam.length; row++) {
            for (int column = 0; column < arrayParam[row].length; column++) {

                if (arrayParam[row][column] > largest) {
                    largest = arrayParam[row][column];
                    location[0] = row;
                    location[1] = column;
                }
            }
        }

        return location;
    }

    // Returns the location of the smallest value in a double array.
    public static int[] locateSmallest(double[][] arrayParam) {

        int[] location = {0, 0};
        double smallest = arrayParam[0][0];

        for (int row = 0; row < arrayParam.length; row++) {
            for (int column = 0; column < arrayParam[row].length; column++) {

                if (arrayParam[row][column] < smallest) {
                    smallest = arrayParam[row][column];
                    location[0] = row;
                    location[1] = column;
                }
            }
        }

        return location;
    }

    // Returns the location of the smallest value in an int array.
    public static int[] locateSmallest(int[][] arrayParam) {

        int[] location = {0, 0};
        int smallest = arrayParam[0][0];

        for (int row = 0; row < arrayParam.length; row++) {
            for (int column = 0; column < arrayParam[row].length; column++) {

                if (arrayParam[row][column] < smallest) {
                    smallest = arrayParam[row][column];
                    location[0] = row;
                    location[1] = column;
                }
            }
        }

        return location;
    }

    public static void main(String[] args) {

        int[][] intArray = {
            {10, 20, 30},
            {5, 50, 15},
            {25, 8, 40}
        };

        double[][] doubleArray = {
            {10.5, 2.7, 30.8},
            {4.2, 50.6, 15.1},
            {25.9, 8.3, 40.4}
        };

        int[] location;

        // Test int array
        location = locateLargest(intArray);
        System.out.println("Largest int location: [" +
                location[0] + "][" + location[1] + "]");

        location = locateSmallest(intArray);
        System.out.println("Smallest int location: [" +
                location[0] + "][" + location[1] + "]");

        // Test double array
        location = locateLargest(doubleArray);
        System.out.println("Largest double location: [" +
                location[0] + "][" + location[1] + "]");

        location = locateSmallest(doubleArray);
        System.out.println("Smallest double location: [" +
                location[0] + "][" + location[1] + "]");
    }
}