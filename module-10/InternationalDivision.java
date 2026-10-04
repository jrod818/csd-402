/*
 * Jose Rodriguez
 * 10/04/2026
 * CSD-402 Module 10.2 
 * Programming Assignment
 *
 * This class represents an international company division.
 */

public class InternationalDivision extends Division {

    private String country;
    private String language;

    // Constructor requires values for all fields
    public InternationalDivision(String divisionName, int accountNumber,
                                 String country, String language) {

        super(divisionName, accountNumber);

        this.country = country;
        this.language = language;
    }

    // Displays information about the international division
    @Override
    public void display() {
        System.out.println("International Division");
        System.out.println("Division Name: " + divisionName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Country: " + country);
        System.out.println("Language: " + language);
        System.out.println();
    }
}