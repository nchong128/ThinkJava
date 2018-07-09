/** Classes
    - When you define a new class, you also create a type with the same name
    - e.g. Creating the Hello class leads to creating the type Hello

    - Key points: 
    - Defining a class creates a new object type with the same name
    - Every object belongs to some object type; i.e. it is an instance of some class
    - A class definition is a template for objects: specifies what attributes the object has
        - and what methods can operate on it
    - A class is like a blueprint for a house, can use the same blueprint to build any number of houses
    - The methods that operate on an object type are defined in the class for that object
 */

/** The Time Class
    - One main reason to define a new class is to encapsulate related data in an object that can be treated
        - as a single unit
    - Can use the objects as parameters and return values, rather than passing and returning multiple values
    - Principle known as data encapsulation
    - Data encapsulated in a Time object are an hour, minute and number of seconds
    - Every Time object will contain this data, we define attributes to hold them

    - Attributes are also called instance variables (each instance has its own variables)
 */
public class Time {
    // First step: Decide what type each variable should be
    // Instance variables are declared at the beginning of the class definition
    private int hour;
    private int minute;
    private double second;

    // Time class is public -> Can be used in other classes
    // Has private instances -> Can only be accessed from inside the Time class
    // Private instance variables help keep classes isolated from each other, changes in one class
        // will not require changes in other classes.
    // Known as information hiding.

    // Second step: Define a constructor, a special method that initialises the instance variables
    // Similar to other methods except that...
        // The name of the constructor is the same as the name of the class
        // Constructors have no return type (and no return value)
        // No static keyword
    public Time() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0.0;
    }

    // this is a keyword that refers to the object being created
    // Can use "this" the same way you use the name of any other object
    // Can read and write the attributes of "this" and can pass "this" as an argument
    // Do not need to declare this and cannot make an assignment to it
        
    // To create a Time object..
    // Time example = new Time();
    // When you invoke new, Java creates object -> Calls constructor to initalise attributes
    // When constructor is done, new returns a reference to the new object

    // Constructors can be overloaded, can provide multiple constructors with different parameters
    // Java matches the arguments provided with the parameters of the constructors
    // Common to provide a constructor with no arguments and a value constructor
    public Time(int hour, int minute, double second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    // This constructor copies values from the parameters to the instance variables
    // The names and types of the parameters are the same as the instrance variables
        // so the parameters shadow the instance variables, so the keyword "this" is needed to tell them apart
    // This constructor would be invoked from something like
        // Time time = new Time(11,59,59.9)

    // The attributes of Time are private, can access from within the Time class
    // But cannot be accessed from another class -> Leads to compile error
    // Solution is to provide methods to access the instance variables

    // Getters (accessors) are methods that read the attributes of a class
    // Convention is for method getSomething to retrieve that something
    public int getHour() {
        return this.hour;
    }

    public int getMinute() {
        return this.minute;
    }
    
    public double getSecond() {
        return this.second;
    }

    // Setters (mutators) are methods that modify the attributes of a class
    // Conventino si for method setSomething to change that something
    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(double second) {
        this.second = second;
    }

    public static void printTime(Time t) {
        System.out.printf("%02d:%02d:%04.1f\n", t.hour, t.minute, t.second);
    }

    // Every object type has a toString method that returns the string representation of the object
    // Displaying the object using print/println leads to Java using the toString method automatically
    // By default it displays the type of object and address, overrridden by toString method defined
    public String toString() {
        return String.format("%02d:%02d:%04.1f\n", this.hour, this.minute, this.second);
    }
    // Does not have static keyword as it is not a static method
    // It is an instance method, when invoked, its invoked on an instance of the class
    // Instance methods are called "non-static"
    // Similar to the printTime method except this is used to refer to the current instance
        // and String.format is used to return a formatted String without displaying
    
    

    
}
