/*
 * Jose Rodriguez
 * 10/04/2026
 * CSD-402 Module 10.2
 * Programming Assignment
 *
 * This program creates two InternationalDivision objects
 * and two DomesticDivision objects and displays their information.
 */

public class UseDivision {

    public static void main(String[] args) {

        // Create two international divisions
        InternationalDivision international1 =
                new InternationalDivision(
                        "Japan Division",
                        1001,
                        "Japan",
                        "Japanese");

        InternationalDivision international2 =
                new InternationalDivision(
                        "Mexico Division",
                        1002,
                        "Mexico",
                        "Spanish");

        // Create two domestic divisions
        DomesticDivision domestic1 =
                new DomesticDivision(
                        "California Division",
                        2001,
                        "California");

        DomesticDivision domestic2 =
                new DomesticDivision(
                        "Texas Division",
                        2002,
                        "Texas");

        // Display all division information
        international1.display();
        international2.display();
        domestic1.display();
        domestic2.display();
    }
}