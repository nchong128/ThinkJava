public class TileClient {

    public static void main(String[] args) {
        Tile t = new Tile('A', 1);
        Tile.printTile(t);
        Tile.testTile();
        System.out.println(t);
        Tile t2 = new Tile('A', 2);

        System.out.println(t.equals(t2));
        t.setValue(4);
        System.out.println(t.getValue());
    }
}