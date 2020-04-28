import java.util.Arrays;
import java.util.Scanner;

public class CreatePlayerField extends Game {

    Game game = new Game();
    public final int [] [] playerShipCoord = game.rndCoordinates();
    int[][] field = new int[game.fieldHeight][game.fieldHeight];
    int[] playerHit= new int[2];


    public int [] [] playerField() {
        updField(field, playerShipCoord);
        return field;
    }


    int [] [] botCoordinates = game.rndCoordinates();
    int[][] botField = new int[game.fieldHeight][game.fieldHeight];
    int[] botHit= new int[2];

    public int [] [] botField() {
        updField(botField, botCoordinates);
        return botField;
    }


    public void botTurn() {
        botHit[0]=game.rndGenerator(fieldHeight);
        botHit[1]=game.rndGenerator(fieldHeight);
        System.out.println(Arrays.toString(botHit));
        System.out.println(Arrays.deepToString(playerShipCoord));
        for (int [] coord:playerShipCoord) {
            if (Arrays.equals(coord, botHit)){
                System.out.println("Попал"+Arrays.toString(coord));
                botTurn();
                break;
            }
            //else System.out.println("Мимо" +Arrays.toString(coord));

        }
        System.out.println("Бот мимо");
        playerTurn();

    }

    public void playerTurn() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координаты");
        playerHit[0] = scanner.nextInt();
        playerHit[1]=scanner.nextInt();
        System.out.println(Arrays.toString(playerHit));
        System.out.println(Arrays.deepToString(botCoordinates));
        for (int [] coord:botCoordinates) {
            if (Arrays.equals(coord, playerHit)){
                System.out.println("Попал");
                playerTurn();
                break;
            }
            //else System.out.println("Мимо");

        }System.out.println("Игрок мимо");
        botTurn();
    }
}
