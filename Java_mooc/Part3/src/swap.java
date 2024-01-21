import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 3;
        numbers[2] = 5;
        numbers[3] = 7;
        numbers[4] = 9;


        int index = 0;
        while (index < numbers.length) {
            System.out.println(numbers[index]);
            index++;
        }
        System.out.println();
        System.out.println("enter an indice to swap:");
        int swap = scanner.nextInt();
        System.out.println("swap with:");
        int swap2 = scanner.nextInt();
        int helper = numbers[swap];
        numbers[swap] = numbers[swap2];
        numbers[swap2] = helper;

        System.out.println();
        index = 0;
        while (index < numbers.length) {
            System.out.println(numbers[index]);
            index++;
        }

    }
}



