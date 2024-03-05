import com.sun.tools.javac.Main;

import java.util.Arrays;

public class MainProgram {
    public static void main(String[] args) {

        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);

    }

    public static int smallest(int[] array) {
        int smallest = Integer.MAX_VALUE;

        for (int x : array) {
            if (x < smallest) {
                smallest = x;
            }
        }
        return smallest;

    }

    public static int indexOfSmallest(int[] array) {
        int smallest = smallest(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == smallest) {
                return i;
            }
        }
        return -1;
    }

    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int smallest = Integer.MAX_VALUE;
        int getIndex = 0;
        for (int i = startIndex; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                getIndex = i;
            }
        }
        return getIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        int valueIndex1 = array[index1];
        int valueIndex2 = array[index2];

        array[index1] = valueIndex2;
        array[index2] = valueIndex1;

    }

    public static void sort(int[] array) {
        int smallest = Integer.MAX_VALUE;
        int startIndex = 0;
        int valueAtStartIndex = array[startIndex];
        for (int i = startIndex; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i]; //this gives us our smallest value in the array
            }
            valueAtStartIndex = smallest;
            startIndex++;
        }
    }
}
