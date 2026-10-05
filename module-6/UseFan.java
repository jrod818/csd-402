/*
 * Jose Rodriguez
 * 10/2/2026
 * CSD-402 Module 6.2
 * Programming Assignment
 * Fan Test Program
 */

public class UseFan {

    public static void main(String[] args) {

        // Fan using the default constructor
        Fan fan1 = new Fan();

        // Fan using the argument constructor
        Fan fan2 = new Fan(Fan.FAST, true, 10, "blue");

        // Display both fans
        System.out.println("Fan 1 - Default Values");
        System.out.println("----------------------");
        System.out.println(fan1);

        System.out.println();

        System.out.println("Fan 2 - Argument Constructor");
        System.out.println("----------------------------");
        System.out.println(fan2);

        // Demonstrate setter methods
        fan1.setSpeed(Fan.MEDIUM);
        fan1.setOn(true);
        fan1.setRadius(8);
        fan1.setColor("red");

        System.out.println();
        System.out.println("Fan 1 - After Changes");
        System.out.println("---------------------");
        System.out.println(fan1);

        // Demonstrate getter methods
        System.out.println();
        System.out.println("Fan 2 - Getter Methods");
        System.out.println("----------------------");
        System.out.println("Speed: " + fan2.getSpeed());
        System.out.println("On: " + fan2.isOn());
        System.out.println("Radius: " + fan2.getRadius());
        System.out.println("Color: " + fan2.getColor());
    }
}