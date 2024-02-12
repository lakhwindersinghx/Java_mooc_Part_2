import java.util.Timer;

public class ClockHand {
    private int limit;
    private int value;

    public ClockHand(int limit) {
        this.limit=limit;
        this.value=0;
    }
    public void advance() {
        this.value++;
        if (this.value >= this.limit) {
            this.value = 0;
        }
    }

    public int value(){
        return this.value;
    }
    public String toString() {
        return "" + this.value;
    }
}
