import java.util.*;

public class Game extends AbstractBattleship {
    int fieldHeight = 3;
    int shipsQuantity = 2;
    int[][] shipCoordinates = new int[shipsQuantity][2];


    public Game(int fieldHeight, int shipsQuantity, int[][] shipCoordinates) {
        super(fieldHeight, shipsQuantity, shipCoordinates);
    }


    public Game() {
        super();
        rndGenerator();
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

    public int[][] updField(int[][] field, int[][] shipCoordinates, int[] botHit) {
        boolean zero = false;


        for (int i = 0; i < fieldHeight; i++) {
            for (int j = 0; j < fieldHeight; j++) {

                 if (field[i][j] != 6) {
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
        }

        for (int[] coord : shipCoordinates) {
            if (Arrays.equals(coord, botHit)) {
                HitCoordinatesStorage.INSTANCE.getSixCoord().add(botHit);
                break;
            }
        }

        for (int[] coord : HitCoordinatesStorage.INSTANCE.getSixCoord()) {
            field[coord[0]][coord[1]] = 6;
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
    public boolean gameOver (int[] [] field){
        boolean gameOver = true;
        for (int i = 0; i < fieldHeight; i++) {
            for (int j = 0; j < fieldHeight; j++) {
                if(field[i][j]==1){
                    gameOver=false;
                }
            }
        }

return  gameOver;
    }
}
