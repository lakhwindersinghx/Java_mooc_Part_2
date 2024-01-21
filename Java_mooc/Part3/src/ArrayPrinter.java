public class ArrayPrinter {
    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        for (int item : array) {
            if (item == array[array.length - 1]) {
                System.out.print(item);
                break;
            }
                System.out.print(item + ", ");

            }
        }
    }

