/*
 * Jose Rodriguez
 * 8/27/26
 * CSD 402 Module 4.2
 * 
 * Overloaded Average Methods
 */

public class Rodriguez_mod_4_2_csd402 {

    public static void main(String[] args) {

        short[] shortArray = {10, 20, 30};
        int[] intArray = {5, 10, 15, 20};
        long[] longArray = {100, 200, 300, 400, 500};
        double[] doubleArray = {2.5, 3.5, 4.5, 5.5, 6.5, 7.5};

        System.out.println("Short Array:");
        for (int i = 0; i < shortArray.length; i++) {
            System.out.print(shortArray[i] + " ");
        }
        System.out.println();
        System.out.println("Average = " + average(shortArray));
        System.out.println();

        System.out.println("Int Array:");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
        System.out.println();
        System.out.println("Average = " + average(intArray));
        System.out.println();

        System.out.println("Long Array:");
        for (int i = 0; i < longArray.length; i++) {
            System.out.print(longArray[i] + " ");
        }
        System.out.println();
        System.out.println("Average = " + average(longArray));
        System.out.println();

        System.out.println("Double Array:");
        for (int i = 0; i < doubleArray.length; i++) {
            System.out.print(doubleArray[i] + " ");
        }
        System.out.println();
        System.out.println("Average = " + average(doubleArray));
    }

    public static short average(short[] array) {

        short sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return (short)(sum / array.length);
    }

    public static int average(int[] array) {

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return sum / array.length;
    }

    public static long average(long[] array) {

        long sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return sum / array.length;
    }

    public static double average(double[] array) {

        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return sum / array.length;
    }
}