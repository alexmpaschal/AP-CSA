/* This program will create Cube objects and calculate 
volume and surface area */

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