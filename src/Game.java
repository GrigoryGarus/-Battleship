import java.util.Random;

public class Game extends AbstractBattleship {


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

    public int[] [] rndCoordinates(int shipsQuantity) {
        for (int i = 0; i <shipsQuantity; i++) {
            for (int j = 0; j <2; j++) {
                int k =rndGenerator(fieldHeight);
                shipCoordinates[i][j]=k;

            }
        }
        return shipCoordinates;

    }








    @Override
    public void printField() {

    }

    @Override
    public void turn() {

    }
}
