import java.util.ArrayList;

public class ArrayAsAString {
    public static void main(String[] args) {

        int[][] matrix = {
                {3, 2, 7, 6},
                {2, 4, 1, 0},
                {3, 2, 1, 0}
        };
        System.out.println(sumsOfRows(matrix));

    }

    public static String arrayAsString(int[][] array) {
        StringBuilder stringArray = new StringBuilder();
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {

                int value = array[row][column];
                stringArray.append(value);
            }
            stringArray.append("\n");
        }
        return stringArray.toString();
    }
    public static ArrayList<Integer> sumsOfRows(int[][] array){
        ArrayList<Integer> sum=new ArrayList<>();
        int sumOfRow=0;
        for(int row=0;row< array.length;row++) {
            sumOfRow=0;
            for (int column = 0; column < array[row].length; column++) {
                sumOfRow += array[row][column];
            }
            sum.add(sumOfRow);
        }
        return sum;
    }
}
