/*
 * Jose Rodriguez
 * 9/27/26
 * CSD-402 Module 9.2 
 *
 * Program 2
 * This program creates a file named data.file if it does not already
 * exist. It writes or appends 10 randomly generated integers to the
 * file. The program then reopens the file, reads the stored data,
 * and displays the contents.
 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class RodriguezDataFile {

    public static void main(String[] args) {

        File file = new File("data.file");
        Random random = new Random();

        try {
            // true allows new data to be appended to the existing file
            FileWriter writer = new FileWriter(file, true);

            // Generate and write 10 random integers
            for (int i = 0; i < 10; i++) {
                int randomNumber = random.nextInt(100);
                writer.write(randomNumber + " ");
            }

            writer.close();

            System.out.println("10 random numbers have been added to data.file.");

            // Reopen the file and display its contents
            Scanner fileReader = new Scanner(file);

            System.out.println("\nContents of data.file:");

            while (fileReader.hasNext()) {
                System.out.print(fileReader.next() + " ");
            }

            fileReader.close();

        } catch (IOException e) {
            System.out.println("An error occurred while working with the file.");
            e.printStackTrace();
        }
    }
}