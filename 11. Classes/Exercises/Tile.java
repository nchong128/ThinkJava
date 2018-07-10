public class Tile {
    // Instance variables declared
    char letter;
    int value;

    // Constructor made
    public Tile(char letter, int value) {
        this.letter = letter;
        this.value = value;
    }

    public static void printTile(Tile t) {
        System.out.printf("The tile is %c with a value of %d.", t.letter, t.value);
        System.out.println();
    }

    public static void testTile() {
        Tile test = new Tile('Z',10);
        Tile.printTile(test);
    }

    public String toString() {
        return String.format("%c:%d",this.letter, this.value);
    }

    public boolean equals(Tile t2) {
        return this.letter == t2.letter 
            && this.value == t2.value;
    }

    public char getLetter() {  
        return this.letter;
    }
    
    public int getValue() {
        return this.value;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
}