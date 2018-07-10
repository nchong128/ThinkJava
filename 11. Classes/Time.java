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
    // Convention is for method setSomething to change that something
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
    
    /** equals Method
        - Have seen two ways to check if values are equal, using == or equals method
        - == operator checks whether objects are identical, i.e. whether they are the same object
        - equals method checks whether objects are equivalent, i.e. whether they have the same value
        - Definition of identity is always the same but not for equivalence -> Objects can define their
            - own equals method
        - By default, the equals method does the same thing as ==, need to redefine
        - equals is an instance method, uses this to refer to the current object and does have the static keyword
     */
    
    public boolean equals(Time that) {
        return this.hour == that.hour
            && this.minute == that.minute
            && this.second == that.second;
    }

    /** Adding Times
        - Two ways to add time:
            - Can write a static metho that takes two Time objects as parameters
            - Can write an instance method that gets invoked on one object and takes the other as a parameter
     */

    // Static approach
    public static Time add(Time t1, Time t2) {
        Time sum = new Time();
        sum.hour = t1.hour + t2.hour;
        sum.minute = t1.minute + t2.minute;
        sum.second = t1.second + t2.second;
        return sum;
    }

    // Note: no static keyword, no t1 parameter, t1 replaced with this
    public Time add(Time t2) {
        Time sum = new Time();
        sum.hour = this.hour + t2.hour;
        sum.minute = this.minute + t2.minute;
        sum.second = this.second + t2.second;

        if (sum.second >= 60.0) {
            sum.second -= 60.0;
            sum.minute += 1;
        }
        if (sum.minute >= 60) {
            sum.minute -= 60;
            sum.hour += 1;
        }
        return sum;
    }

    // Previous implementation does not modify either of its parameters,
        // creates and returns a new Time object
    // Can write a method like this that modifies the existing Time object
    public void increment(double seconds) {
        this.second += seconds;
        while (this.second >= 60.0) {
            this.second -= 60.0;
            this.minute += 1;
        }
        while (this.minute >= 60) {
            this.minute -= 60;
            this.hour += 1;
        }
    }

    /**
        - Methods like add are pure because
            - they do not modify the parameters
            - they don't have an side effects (e.g. printing)
            - the return value only depends on the parameters, not on any other state
        - This is known as a modifier
            - Usually void methods, sometimes returning a refrence to the object they modify
            - More efficient as no new objects created but more error-prone
            - When objects are aliased, the effects of modifiers can be confusing
        - To make a class immutable, can provide getters but no setters
            - and pure methods but no modifiers
     */    
}
