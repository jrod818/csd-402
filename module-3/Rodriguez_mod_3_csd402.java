/*
    Jose Rodriguez
    8/23/26
    CSD-402 Module 3.2
    Nested For Loops Assignment
 */

public class Rodriguez_mod_3_csd402 {

    public static void main(String[] args) {

        for (int i = 0; i <= 6; i++) {

            // Leading spaces
            for (int j = 0; j < (6 - i); j++) {
                System.out.print("  ");
            }

            int number = 1;

            // Ascending numbers
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * 2;
            }

            number = number / 4;

            // Descending numbers
            for (int j = i; j > 0; j--) {
                System.out.print(number + " ");
                number = number / 2;
            }

            System.out.println("@");
        }
    }
}