public class Rational {
    int numer, denom;

    /**
     * Two possible constructors
     */
    public Rational() {
        this.numer = 0;
        this.denom = 1;
    }

    public Rational(int numer, int denom) {
        this.numer = numer;
        this.denom = denom;
    }

    /**
     *  Defining the getters and setters
     */

    public int getNumer() {
        return this.numer;
    }

    public int getDenom() {
        return this.denom;
    }

    public void setNumer(int numer) {
        this.numer = numer;
    }

    public void setDenom(int denom) {
        this.denom = denom;
    }

    /**
     * Prints the rational number in a useful format
     */
    public void printRational() {
        System.out.printf("The numerator is %d with a denominator of %d" ,this.numer, this.denom);
        System.out.println();
    }

    public String toString() {
        return String.format("The numerator is %d with a denominator of %d" ,this.numer, this.denom);
    }

    /**
     * A modifier method to reverse the sgin of a rational number
     */
    public void negate() {
        this.numer *= -1;
        this.denom *= -1;
    }

    /**
     * A modifier method that swaps the numerator and denominator
     */
    public void invert() {
        int temp;
        temp = this.numer;
        this.numer = this.denom;
        this.denom = temp;
    }

    /**
     * Converts the rational number to a double and returns the result
     * This is a pure method, does not modify the object
     */
    public double toDouble() {
        double numer = (double) this.numer;
        double denom = this.denom;
        double result = numer /  denom;

        return result;
    }

    public Rational add(Rational r2) {
        int temp = r2.denom;
        int finalNumer;
        Rational finalAns;

        r2.numer *= this.denom;
        r2.denom *= this.denom;
        this.numer *= temp;
        this.denom *= temp;

        finalNumer = r2.numer + this.numer;
        finalAns = new Rational(finalNumer, this.denom);
        return finalAns;

    }


}