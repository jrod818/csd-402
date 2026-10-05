/*
 * Jose Rodriguez
 * 10/4/2026
 * CSD-402 Module 7.2
 * Programming Assignment
 * UseFans Program
 */

import java.util.ArrayList;

public class UseFans {

    /*
     * Displays information for a single Fan instance
     * without using the toString() method.
     */
    public static void displayFan(Fan fan) {

        System.out.println("Speed: " + fan.getSpeed());
        System.out.println("On: " + fan.isOn());
        System.out.println("Radius: " + fan.getRadius());
        System.out.println("Color: " + fan.getColor());
    }

    /*
     * Displays all Fan instances in a collection
     * without using the toString() method.
     */
    public static void displayFans(ArrayList<Fan> fans) {

        int fanNumber = 1;

        for (Fan fan : fans) {

            System.out.println();
            System.out.println("Fan " + fanNumber);
            System.out.println("--------------------");

            displayFan(fan);

            fanNumber++;
        }
    }

    public static void main(String[] args) {

        // Create a collection of Fan instances
        ArrayList<Fan> fans = new ArrayList<>();

        // Add Fan objects to the collection
        fans.add(new Fan());

        fans.add(new Fan(
                Fan.SLOW,
                true,
                7,
                "blue"));

        fans.add(new Fan(
                Fan.MEDIUM,
                true,
                8,
                "red"));

        fans.add(new Fan(
                Fan.FAST,
                true,
                10,
                "black"));

        // Display all fans in the collection
        System.out.println("Fan Collection");
        System.out.println("====================");

        displayFans(fans);

        // Demonstrate displaying one Fan instance
        System.out.println();
        System.out.println("Single Fan Display");
        System.out.println("====================");

        displayFan(fans.get(2));
    }
}