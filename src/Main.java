import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int shipsQuantity = 3;
        int fieldHeight =4;
        int [] [] shipCoordinates = new int[shipsQuantity][2];


        Game game = new Game(fieldHeight,shipsQuantity, shipCoordinates);
        shipCoordinates = game.rndCoordinates(shipsQuantity);


        System.out.println(Arrays.deepToString(shipCoordinates));
        System.out.println(shipCoordinates[1][1]);

    }

}
