import java.util.Arrays;

public class CreateBotField extends Game {



    Game game = new Game();
    CreatePlayerField playerField = new CreatePlayerField();

    int [] [] botCoordinates = new int[fieldHeight][2];
        int[] botHit= new int[2];


    @Override
    public void turn() {
        botHit[0]=game.rndGenerator(fieldHeight);
        botHit[1]=game.rndGenerator(fieldHeight);
        System.out.println(Arrays.toString(botHit));
        System.out.println(Arrays.deepToString(playerField.playerShipCoord));
        for (int [] coord:playerField.playerShipCoord) {
            if (Arrays.equals(coord, botHit)){
                System.out.println("Попал");
                break;
            }
            else System.out.println("Мимо" +Arrays.toString(coord));

        }
    }


}
