// java.awt package also has a class called Rectangle
import java.awt.Rectangle;
import java.awt.Point;

// Has 4 attributes: x,y, width, height

public class RectangleMethod {

    public static void main(String[] args) {
        // Rectangle object created with variable "box" referring to it
        Rectangle box = new Rectangle(0,0,100,200);

        // Can display the object with its attributes
        System.out.println(box);

        // Can write methods that return objects
        // findCentre takes a Rectangle as an object and returns a Point
        // with the coordinates of the center of the Rectangle
        System.out.println(findCentre(box));

        //mutableObjects();

        aliasing();

    }

    public static Point findCentre(Rectangle box) {
        int x = box.x + box.width / 2;
        int y = box.y + box.height / 2;

        // Creates a new Point object and returns a reference to it
        return new Point(x,y);
    }

    public static void mutableObjects() {
        // Can change content of an object through re-assignment
        Rectangle box = new Rectangle(0,0,100,200);
        box.x = box.x + 50;
        box.y = box.y + 100;

        // Can encapsulate this method
        // By specifying box as the argument, the reference is passed
        // to the method, so that the method will now operate on the object
        moveRect(box, 1, 2);

        // Java has methods that operate on Point and Rectangle
        // Uses dot notation as this is a method provided with the object
        box.translate(10,2);

        // Good illustration of OOP: no need to write methods -> Just apply methods
        // to themselves using dot notation
    }

    public static void moveRect(Rectangle box, int dx, int dy) {
        box.x = box.x + dx;
        box.y = box.y + dy;
    }

    public static void aliasing() {
        // When you assign an object to a variable, assigning a reference to the object
        // Can have multiple variables that refer to the same object
        Rectangle box1 = new Rectangle(0,0,100,200);
        Rectangle box2 = box1;

        // box1 and box2 are aliases for the same object
        // Any changes to one variable affect the other
        System.out.println(box2.width);
        box1.grow(50,50);
        System.out.println(box2.width);

        // The null keyword
        // When you create an object variable, you are storing a
        // reference to an object
        // null is a special value that means "no object"
        // Can declare and initialise object variables this way
        Point blank = null;

        // Trying to use a null value by accessing an attribute or invoking a method
        // leads to a NullPointerException
        
        // Legal to pass a null reference as an argument or receive one as ar eturn value
        // Null is often used to represent a special condition or to indicate an error
    
        // Garbage Collection
        // When no variables refer to an object, there is no way to
        // access its attributes or invoke a method on it
        // Still in the memory, taking up space
        // Asthe program runs, system looks for stranded objects and reclaims them,
        // space can be reused for new objects, process known as garbage collection

        // Class diagram
        // Objects have their own attributes and methods
        // Attributes are an objects data and methods are an objects code
        // An objects class defines which attributes and methods it will have
        // Class diagrams show the attributes nad methods, with the types given

        // Summary
        // Objects encapsulate data and provides methods to access and modify the data directly
        // OOP makes it possible to hide details to be more easily used 

    }


}