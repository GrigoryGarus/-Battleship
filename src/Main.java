import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        Game game = new Game();
        CreatePlayerField playerField = new CreatePlayerField();
        CreateBotField botField = new CreateBotField();


        //System.out.println(Arrays.deepToString(game.startField()));

//        playerField.playerField();
//        playerField.botField();
        game.printField(playerField.playerField);
       playerField.botTurn();

      // playerField.playerField();

        //System.out.println(Arrays.deepToString(game.shipCoordinates));

    }

}
