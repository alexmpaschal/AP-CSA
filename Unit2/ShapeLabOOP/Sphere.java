/* This program will create Cube objects and create methods to calculate the volume and surface area of them. */

package Unit2.ShapeLabOOP;

public class Sphere {
    // Instance variables
    double radius;

    // Constructor
    public Sphere( double r ) {
        radius = r;
    }

    // Methods
    public double calcVolume() {
        return ( 4.0 / 3.0 ) * Math.PI * Math.pow( radius, 3 );
    }

    public double calcSurfaceArea() {
        return 4.0 * Math.PI * Math.pow( radius, 2 );
    }
}