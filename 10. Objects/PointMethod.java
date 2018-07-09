/** Objects
    - Object is a collection of data that provides a set of methods
    - Java is object oriented, so it uses objects to represent data and provide methods to them
    - There are two new types of objects: Point and Rectangle
 */

/** Point Objects
    - java.awt package gives a class, Point, to represent Cartesian coordinates
 */

import java.awt.Point;

public class PointMethod {

    public static void main(String[] args) {
        // Creating a new Point
        // blank has a type Point
        Point blank;
        // Point created with given arguments as coordinates
        blank = new Point(3,4);

        // Result of the new operator is a reference to the new object

        // Attributes (or fields): Variables that belong to an object
        // Java uses dot notation to access an attribute of an object
        int x = blank.x;

        // blank.x means "go to the object blank refers to, get the value of the attribute x"

        // dot notation can be part of an expression
        System.out.println(blank.x + ", " + blank.y );
        int sum = blank.x * blank.x + blank.y * blank.y;

        // Can pass objects as parameters into methods
        printPoint(blank);

        // Can also just display objects using System
        System.out.println(blank);

        // Can also use toStrign method that returns a String representation
        // of a point

        // Passing objects as parameters -> Source code is more readable, less errors
        // related values are bundled together

    }

    public static void printPoint(Point p) {
        // Method takes point as argument and displays its attributes in parentheses
        System.out.println("(" + p.x + "," + p.y + ")");
    }
}