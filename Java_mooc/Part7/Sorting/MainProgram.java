import com.sun.tools.javac.Main;

import java.util.Arrays;

public class MainProgram {
    public static void main(String[] args) {
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        System.out.println(Arrays.toString(numbers));
        MainProgram.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(MainProgram.smallest(numbers));


    }

    public static int smallest(int[] array) {
        int smallest = array[0];

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

        int startOfIndex = 0;
        int counter = 1;

        for (int i = startOfIndex; i < array.length; i++) {
            System.out.println(counter + " current update " + Arrays.toString(array));
            counter++;

            int smallest = array[i];
            int indexOfSmallest = i; // Initialize indexOfSmallest with current index

            for (int j = i ; j < array.length; j++) {
                if (array[j] < smallest) {
                    smallest = array[j];
                    indexOfSmallest = j;
                }
            }

            // Swap the values
            int temp = array[i];
            array[i] = array[indexOfSmallest];
            array[indexOfSmallest] = temp;
        }
    }

}



