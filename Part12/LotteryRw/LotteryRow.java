import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {
    private ArrayList<Integer> numbers;

    public LotteryRow() {
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        // Initialize the list for numbers
        this.numbers = new ArrayList<>();
        Random randomizer = new Random();

        // Generate unique random numbers until we have 7 of them
        while (this.numbers.size() < 7) {
            int randomNumber = randomizer.nextInt(40) + 1; // Ensure the number is between 1 and 40 (inclusive)
            if (!this.containsNumber(randomNumber)) {
                this.numbers.add(randomNumber); // Only add the number if it is not already in the list
            }
        }
    }


    public boolean containsNumber(int number) {
        return this.numbers.contains(number);
    }


    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LotteryRow)) {
            return false;
        }
        LotteryRow lotteryObject = (LotteryRow) other;

        if (this.numbers.equals(lotteryObject.numbers)) {
            return true;
        }
        return false;
    }
}