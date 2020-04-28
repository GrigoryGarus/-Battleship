import java.util.Random;

public class Game extends AbstractBattleship {
    int fieldHeight = 3;
    int shipsQuantity = 3;
    int [] [] shipCoordinates = new int[shipsQuantity][2];



    public Game(int fieldHeight, int shipsQuantity, int[][] shipCoordinates) {
        super(fieldHeight, shipsQuantity, shipCoordinates);
    }


    public Game() {
        super();
        rndGenerator();
    }
    public int [] [] playerShipCoord() {
        int[] [] coord =rndCoordinates();

        return coord;
    }



    public int rndGenerator(int i) {
        Random rand = new Random();
        int n = rand.nextInt(i);
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

//    public int [] [] startField() {
//        int[][] field = new int[fieldHeight][fieldHeight];
//        rndCoordinates();
//        updField(field);
//        return field;
//    }

    public int [] [] updField(int[][] field, int[][] shipCoordinates) {
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




    public void printField(int[][] field) {
        for (int i = 0; i < fieldHeight; i++) {
            for (int j = 0; j < fieldHeight; j++) {
                System.out.print(field[i][j]);
            }
            System.out.println("");
        }

    }
}
