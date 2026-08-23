/*
 * Jose Rodriguez
 * CSD-402
 * Module 2 Assignment
 *
 * This program calculates the amount of energy needed
 * to heat water from an initial temperature to a final temperature.
 */

import java.util.Scanner;

public class HeatWater {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount of water in kilograms: ");
        double waterMass = input.nextDouble();

        System.out.print("Enter the initial temperature in Celsius: ");
        double initialTemperature = input.nextDouble();

        System.out.print("Enter the final temperature in Celsius: ");
        double finalTemperature = input.nextDouble();

        double q = waterMass
                * (finalTemperature - initialTemperature)
                * 4184;

        System.out.printf(
                "The energy needed is %.2f Joules.%n",
                q
        );

        input.close();
    }
}