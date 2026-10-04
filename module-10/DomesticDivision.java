/*
 * Jose Rodriguez
 * 10/04/2026
 * CSD-402 Module 10.2
 * Programming Assignment
 *
 * This class represents a domestic company division.
 */

public class DomesticDivision extends Division {

    private String state;

    // Constructor requires values for all fields
    public DomesticDivision(String divisionName, int accountNumber,
                            String state) {

        super(divisionName, accountNumber);

        this.state = state;
    }

    // Displays information about the domestic division
    @Override
    public void display() {
        System.out.println("Domestic Division");
        System.out.println("Division Name: " + divisionName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("State: " + state);
        System.out.println();
    }
}