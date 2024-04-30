
import java.util.ArrayList;
import java.util.List;

public class Herd implements Moveable {
    private List<Moveable> herd;

    public Herd() {
        this.herd = new ArrayList<>();
    }

    public void addToHerd(Moveable moveable) {
        this.herd.add(moveable);
    }

    @Override
    public void move(int dx, int dy) {
        for (Moveable organism : this.herd) {
            organism.move(dx, dy);
        }
    }

    @Override
    public String toString() {
        String result = "";
        for (Moveable item : this.herd) {
            result += item.toString() + "\n";
        }
        return result;
    }

}
