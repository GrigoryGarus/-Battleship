import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        Game game = new Game();
        CreatePlayerField playerField = new CreatePlayerField();
        CreateBotField botField = new CreateBotField();


        //System.out.println(Arrays.deepToString(game.startField()));
        game.printField(playerField.playerField());
        //System.out.println(Arrays.deepToString(playerField.playerShipCoord));
        //game.printField(game.startField());
        //playerField.playerField();
       //botField.turn();
       playerField.botTurn();

      // playerField.playerField();

        //System.out.println(Arrays.deepToString(game.shipCoordinates));

    }

}
