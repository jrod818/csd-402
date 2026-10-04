/*
 * Jose Rodriguez
 * 10/04/2026
 * CSD-402 Module 10.2
 * Programming Assignment
 *
 * This abstract class represents a company division.
 * It stores the division name and account number.
 */

public abstract class Division {

    protected String divisionName;
    protected int accountNumber;

    // Constructor requires the division name and account number
    public Division(String divisionName, int accountNumber) {
        this.divisionName = divisionName;
        this.accountNumber = accountNumber;
    }

    // Abstract method implemented by subclasses
    public abstract void display();
}