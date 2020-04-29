import java.util.ArrayList;
import java.util.List;

public enum HitCoordinatesStorage {
    INSTANCE;

    private List<int[]> sixCoord = new ArrayList<int[]>();

    public List<int[]> getSixCoord() {
        return sixCoord;
    }
}
