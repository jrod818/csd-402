/*
 * Jose Rodriguez
 * 9/27/26
 * CSD-402 Module 9.2 
 *
 * Program 1
 * This program creates an ArrayList containing Strings and displays
 * each item using a for-each loop. The user selects an element to
 * display again. Exception handling is used for an invalid selection.
 * The program also demonstrates autoboxing and auto-unboxing.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class RodriguezArrayList {

    public static void main(String[] args) {

        // Create an ArrayList with at least 10 Strings
        ArrayList<String> animals = new ArrayList<>();

        animals.add("Dog");
        animals.add("Cat");
        animals.add("Horse");
        animals.add("Tiger");
        animals.add("Lion");
        animals.add("Elephant");
        animals.add("Bear");
        animals.add("Wolf");
        animals.add("Monkey");
        animals.add("Giraffe");

        // Display the ArrayList using a for-each loop
        System.out.println("Animals in the ArrayList:");

        for (String animal : animals) {
            System.out.println(animal);
        }

        Scanner input = new Scanner(System.in);

        System.out.print("\nEnter the index of the element you would like to see again (0-9): ");

        // Receive the user's input as a String
        String userInput = input.nextLine();

        try {
            // Convert String input to Integer
            // Integer demonstrates autoboxing
            Integer boxedIndex = Integer.valueOf(userInput);

            // Auto-unboxing occurs when Integer is assigned to int
            int index = boxedIndex;

            System.out.println("The element you selected is: " + animals.get(index));

        } catch (IndexOutOfBoundsException | NumberFormatException e) {
            System.out.println("Exception has been thrown: Out of Bounds");
        }

        input.close();
    }
}