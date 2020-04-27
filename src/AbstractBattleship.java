import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public abstract class  AbstractBattleship implements Battleship {

    protected int fieldHeight;
    protected int shipsQuantity;




    public AbstractBattleship() {

    }

    public AbstractBattleship(int fieldHeight, int shipsQuantity ) {
        this.fieldHeight = fieldHeight;
        this.shipsQuantity = shipsQuantity;
        
    }



    @Override
    public void printField() {
        int [] [] field = new int[fieldHeight][fieldHeight];


    }

    @Override
    public int rndGenerator() {
        return 0;
    }

    @Override
    public void turn() {

    }
}
