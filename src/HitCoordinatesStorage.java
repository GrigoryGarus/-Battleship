import java.util.ArrayList;
import java.util.List;

public enum HitCoordinatesStorage {
    INSTANCE;

    private List<int[]> sixCoord = new ArrayList<int[]>();
    private List<int[]> hitCoord = new ArrayList<int[]>();

    public List<int[]> getHitCoord() {
        return hitCoord;
    }

    public List<int[]> getSixCoord() {
        return sixCoord;
    }
}
