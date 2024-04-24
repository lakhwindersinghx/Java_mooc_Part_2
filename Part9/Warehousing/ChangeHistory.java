import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double> history;

    public ChangeHistory() {
        this.history = new ArrayList<>();
    }

    public void add(double status) {
        this.history.add(status);
    }

    public void clear() {
        this.history.clear();
    }

    public double maxValue() {
        double max = this.history.get(0);

        for (double element : this.history) {
            if (element > max) {
                max = element;
            }
        }
        return max;
    }


    public double minValue() {
        double min = this.history.get(0);
        for (double element : this.history) {
            if (element < min) {
                min = element;
            }
        }
        return min;
    }

    public double average() {
        double sum = 0;
        for (double item : this.history) {
            sum += item;
        }
        return (double) sum / this.history.size();
    }

    public String toString() {
        return this.history + "";
    }

}

