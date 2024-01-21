public class Printer {
    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }
    public static void printArrayInStars(int[] array) {
        for (int item : array) {
            printStars(item);
        }
    }
    public static void printStars(int times) {
        for (int item = 0; item < times; item++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
