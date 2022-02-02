package ShapeLabOOP;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object called kboard
        Scanner kboard = new Scanner(System.in);

        // Take user input for the radius of a sphere
        System.out.print("Enter the radius of your sphere: ");
        double radius = kboard.nextDouble();

        // Close the Scanner object
        kboard.close();

        // Create a new Sphere object called sphere
        Sphere sphere = new Sphere(radius);

        // Display the volume and surface area of the sphere object
        System.out.println("The volume of your sphere is " + sphere.calcVolume());
        System.out.println("The surface area of your sphere is " + sphere.calcSurfaceArea());
    }
}