import java.util.Random;

public class Game extends AbstractBattleship {


    public Game(int fieldHeight, int shipsQuantity, int[][] shipCoordinates) {
        super(fieldHeight, shipsQuantity, shipCoordinates);
    }


    public Game() {
        super();
        rndGenerator();
    }

    public int [] [] botField() {
        int[][] field = new int[fieldHeight][fieldHeight];
        updField(field);
        printField();
        return field;
    }
    public int [] [] playerField() {
        int[][] field = new int[fieldHeight][fieldHeight];
        updField();
        printField();
        return field;
    }



    public int rndGenerator(int limit) {
        Random rand = new Random();
        int n = rand.nextInt(limit);
        //System.out.println(n);
        return n;
    }

    public int[][] rndCoordinates() {
        for (int i = 0; i < shipsQuantity; i++) {
            for (int j = 0; j < 2; j++) {
                int k = rndGenerator(fieldHeight);
                shipCoordinates[i][j] = k;

            }
        }
        return shipCoordinates;

    }

    public int [] [] updField(int [] [] field) {
        rndCoordinates();
        //int[][] field = new int[fieldHeight][fieldHeight];
        boolean zero = false;
        for (int i = 0; i < fieldHeight; i++) {
            for (int j = 0; j < fieldHeight; j++) {

                for (int k = 0; k < shipCoordinates.length; k++) {
                    if (i == shipCoordinates[k][0] && j == shipCoordinates[k][1]) {
                        field[i][j] = 1;
                        zero = true;
                    }

                }
                if (!zero) {
                    field[i][j] = 0;

                }
                zero = false;
            }

        }
        return field;
    }


    public void printField() {
       int[] [] field = updField();
        for (int i = 0; i < fieldHeight; i++) {
            for (int j = 0; j < fieldHeight; j++) {
                System.out.print(field[i][j]);
            }
            System.out.println("");
        }

    }

    @Override
    public void turn() {

    }
}
