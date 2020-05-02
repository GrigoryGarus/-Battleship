import java.util.Arrays;
import java.util.Scanner;

public class CreatePlayerField extends Game {

    Game game = new Game();
    public final int[][] playerShipCoord = game.rndCoordinates();
    int[][] playerField = new int[game.fieldHeight][game.fieldHeight];
    int[] playerHit = new int[2];


    public int[][] playerField() {
        updField(playerField, playerShipCoord, botHit);
        return playerField;
    }


    int[][] botCoordinates = game.rndCoordinates();
    int[][] botField = new int[game.fieldHeight][game.fieldHeight];
    int[] botHit = new int[2];


    public int[][] botField() {
        updField(botField, botCoordinates, playerHit);
        return botField;
    }


    public void botTurn() {

            botHit[0] = game.rndGenerator(fieldHeight);
            botHit[1] = game.rndGenerator(fieldHeight);


            playerField=playerField();
            System.out.println(Arrays.toString(botHit));
            System.out.println("Координаты игрока " + Arrays.deepToString(playerShipCoord));

            for (int[] coord : playerShipCoord) {
                if (Arrays.equals(coord, botHit)) {
                    System.out.println("Бот попал" + Arrays.toString(coord));
                    game.printField(playerField());

                    if (game.gameOver(playerField)) {
                        System.out.println("Победил бот");
                        break;
                    } else botTurn();
                }
            }
        if (game.gameOver(playerField)) {
            System.out.println("Победил бот");
        } else {System.out.println("Бот мимо");

        game.printField(playerField());
            playerTurn();
        }

    }

    public void playerTurn() {
            botField=botField();
            Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координаты");
        playerHit[0] = scanner.nextInt();
        playerHit[1] = scanner.nextInt();
        System.out.println(Arrays.toString(playerHit));
        System.out.println("Бот " + Arrays.deepToString(botCoordinates));
        for (int[] coord : botCoordinates) {
            if (Arrays.equals(coord, playerHit)) {
                System.out.println("Игрок попал");

                if (game.gameOver(botField())) {
                    System.out.println("Победил игрок");
                } else playerTurn();


            }

        }
        if (game.gameOver(botField())) {
            System.out.println("Победил игрок");
        } else {
            System.out.println("Игрок мимо");
        botTurn();
        }

}
}
