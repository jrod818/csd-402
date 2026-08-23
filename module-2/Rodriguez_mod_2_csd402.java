/*
    Jose Rodriguez
    8/23/36
    CSD-402 Module 2.2
    Rock Paper Scissors
 */

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int computerChoice = random.nextInt(3) + 1;

        System.out.println("Rock Paper Scissors");
        System.out.println("1 = Rock");
        System.out.println("2 = Paper");
        System.out.println("3 = Scissors");
        System.out.print("Enter your choice (1-3): ");

        int userChoice = input.nextInt();

        String computer = "";
        String user = "";

        // Computer choice
        if (computerChoice == 1) {
            computer = "Rock";
        } else if (computerChoice == 2) {
            computer = "Paper";
        } else {
            computer = "Scissors";
        }

        // User choice
        if (userChoice == 1) {
            user = "Rock";
        } else if (userChoice == 2) {
            user = "Paper";
        } else if (userChoice == 3) {
            user = "Scissors";
        } else {
            System.out.println("Invalid choice.");
            input.close();
            return;
        }

        System.out.println();
        System.out.println("Computer chose: " + computer);
        System.out.println("You chose: " + user);
        System.out.println();

        // Determine winner
        if (computerChoice == userChoice) {

            System.out.println("It's a tie!");

        } else if ((userChoice == 1 && computerChoice == 3) ||
                   (userChoice == 2 && computerChoice == 1) ||
                   (userChoice == 3 && computerChoice == 2)) {

            System.out.println("You win!");

        } else {

            System.out.println("Computer wins!");

        }

        input.close();
    }
}