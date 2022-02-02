package ShapeLab;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Creates a Scanner object called kboard
        Scanner kboard = new Scanner(System.in);

        // Takes user input for radius of sphere
        System.out.print("Enter the radius of your sphere as an integer: ");
        int radius = kboard.nextInt();
        kboard.close();

        // Calculates volume and surface area
        double volume = 0.0;
        volume += (4.0 / 3.0) * Math.PI * Math.pow( radius, 3 );
        double surfaceArea = 4.0 * Math.PI * Math.pow( radius, 2 );

        // Displays volume and surfaceArea variables in sentences
        System.out.println("The volume as a double is " + volume + " and as a integer it's " + (int) volume + ".");
        System.out.println("The surface area as a double is " + surfaceArea + " and as a integer it's " + (int) surfaceArea + ".");
    }
}
