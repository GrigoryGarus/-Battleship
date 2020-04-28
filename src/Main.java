import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int shipsQuantity = 3;
        int fieldHeight =4;
        int [] [] shipCoordinates = new int[shipsQuantity][2];


        Game game = new Game(fieldHeight,shipsQuantity, shipCoordinates);
        //game.rndCoordinates();
        //game.printField();
        System.out.println(Arrays.deepToString(shipCoordinates));
        game.botField();
        //int [] [] f = game.updField();
        //System.out.println(Arrays.deepToString(f));
        System.out.println(Arrays.deepToString(shipCoordinates));

    }

}
