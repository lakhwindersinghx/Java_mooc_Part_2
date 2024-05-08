import java.util.ArrayList;

public class Hideout<T> {
    private ArrayList<T> hideout;

    public Hideout() {
        this.hideout = new ArrayList<>();
    }

    public void putIntoHideout(T toHide) {
        if (!hideout.isEmpty()) {
            this.hideout.clear();
            this.hideout.add(toHide);
        }
        this.hideout.add(toHide);
    }

    public T takeFromHideout() {
        if (!hideout.isEmpty()) {
            for(T item:this.hideout){
                this.hideout.clear();
                return item;
            }

        }
        return null;
    }

    public Boolean isInHideout() {
        if (!this.hideout.isEmpty()) {
            return true;
        }
        return false;
    }
}
