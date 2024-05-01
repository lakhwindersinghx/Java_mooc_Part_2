
import java.util.ArrayList;
import java.util.Collections;

public class WageOrder {

    public static void main(String[] args) {
        ArrayList<Human> humans = new ArrayList<>();
        humans.add(new Human("Matti", 150000));
        humans.add(new Human("Merja", 500));
        humans.add(new Human("sexgod",940));
        humans.add(new Human("Pertti", 80));

        System.out.println(humans);


        Collections.sort(humans);
        System.out.println(humans);

    }
}