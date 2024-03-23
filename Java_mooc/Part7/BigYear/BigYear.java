import java.util.ArrayList;
import java.util.Random;

public class BigYear {
    private ArrayList<Birds> birdList;

    public BigYear() {
        this.birdList = new ArrayList<>();
    }

    public void addBird(Birds bird) {
        this.birdList.add(bird);
    }

    public void getBirdList() {
        for (Birds item : birdList) {
            System.out.println(item);
        }
    }

    public void getOneBird() {
        int randomIndex = new Random().nextInt(this.birdList.size());
        System.out.println(this.birdList.get(randomIndex));
    }

    public void observationSearch(String birdKeyword) {
        for (Birds item : this.birdList) {
            if (item.getName().equals(birdKeyword)) {
                item.addObservation();
            }
        }
    }

}