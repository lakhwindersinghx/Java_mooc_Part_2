import java.util.ArrayList;


public class MagicSquare {

    private int[][] square;

    public MagicSquare(int size) {
        if (size < 2) {
            size = 2;
        }

        this.square = new int[size][size];
    }

    public ArrayList<Integer> sumsOfRows() {
        ArrayList<Integer> sum = new ArrayList<>();
        int sumOfRow = 0;
        for (int row = 0; row < square.length; row++) {
            sumOfRow = 0;
            for (int column = 0; column < this.square[row].length; column++) {
                sumOfRow += this.square[row][column];
            }
            sum.add(sumOfRow);
        }
        return sum;
    }

    ArrayList<Integer> sumsOfColumns() {
        ArrayList<Integer> sumColumns = new ArrayList<>();
        int sumOfColumns = 0;
        for (int column = 0; column < square[0].length; column++) {
            sumOfColumns = 0;
            for (int row = 0; row < this.square[row].length; row++) {
                sumOfColumns += this.square[row][column];
            }
            sumColumns.add(sumOfColumns);
        }
        return sumColumns;
    }

    public ArrayList<Integer> sumsOfDiagonals() {
        ArrayList<Integer> sumDiagonals = new ArrayList<>();
        int sumOfDiagonals = 0;
        for (int row = 0; row < square[0].length; row++) {
            sumOfDiagonals = 0;
            for (int column = 0; column < this.square[row].length; column++) {
                if(column==row)
                sumOfDiagonals += this.square[row][column];
                sumDiagonals.add(sumOfDiagonals);
            }
        }
        return sumDiagonals;
    }
}
