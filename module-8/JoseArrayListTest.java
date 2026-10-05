/*
 * Jose Rodriguez
 * 10/4/2026
 * CSD-402 Module 8.2
 * Programming Assignment
 * ArrayList Test Program
 */

import java.util.ArrayList;
import java.util.Scanner;

public class JoseArrayListTest {

    /*
     * Receives an ArrayList and returns the largest Integer.
     * If the ArrayList is empty, the method returns 0.
     */
    public static Integer max(ArrayList list) {

        if (list.isEmpty()) {
            return 0;
        }

        Integer largest = (Integer) list.get(0);

        for (int i = 1; i < list.size(); i++) {
            Integer current = (Integer) list.get(i);

            if (current > largest) {
                largest = current;
            }
        }

        return largest;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Create an ArrayList to store user-entered integers
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("CSD-402 Module 8.2");
        System.out.println("ArrayList Maximum Value Test");
        System.out.println("----------------------------");

        System.out.println("Enter integers one at a time.");
        System.out.println("Enter 0 when you are finished.");

        int number;

        // Continue accepting integers until 0 is entered
        do {
            System.out.print("Enter an integer: ");
            number = input.nextInt();

            // The assignment requires 0 to also be added
            numbers.add(number);

        } while (number != 0);

        // Send the ArrayList to the max method
        Integer largest = max(numbers);

        System.out.println();
        System.out.println("Numbers entered: " + numbers);
        System.out.println("Largest value: " + largest);

        // Additional test for an empty ArrayList
        ArrayList<Integer> emptyList = new ArrayList<>();

        System.out.println();
        System.out.println("Testing an empty ArrayList...");
        System.out.println("Largest value: " + max(emptyList));

        input.close();
    }
}