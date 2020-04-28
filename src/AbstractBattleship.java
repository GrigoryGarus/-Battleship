import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public abstract class  AbstractBattleship implements Battleship {

    protected int fieldHeight;
    protected int shipsQuantity;
    protected int [] [] shipCoordinates = new int[shipsQuantity][2];



    public AbstractBattleship() {

    }

    public AbstractBattleship(int fieldHeight, int shipsQuantity, int[][] shipCoordinates) {
        this.fieldHeight = fieldHeight;
        this.shipsQuantity = shipsQuantity;
        this.shipCoordinates = shipCoordinates;
    }



    @Override
    public void printField() {
        int [] [] field = new int[fieldHeight][fieldHeight];


    }



    public int rndGenerator() {
        return 0;
    }

    @Override
    public void turn() {

    }
}
