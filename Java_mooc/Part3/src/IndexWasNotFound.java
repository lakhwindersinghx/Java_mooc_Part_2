import java.util.Arrays;
import java.util.Scanner;

public class IndexWasNotFound {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer[] numbers = new Integer[5];
        numbers[0] = 1;
        numbers[1] = 3;
        numbers[2] = 5;
        numbers[3] = 7;
        numbers[4] = 9;

        //PRINTING THE ARRAY
        int index = 0;
        while (index < numbers.length) {
            System.out.println(numbers[index]);
            index++;
        }
        System.out.println(Arrays.asList(numbers));
        System.out.println("Search for a number: ");

        int search = scanner.nextInt();
        boolean found = false;
        for (int item : numbers) {
            if (numbers[item] == search) {
                found = true;
                System.out.println(search+" is found at index "+(item));
                break;
            }
        }
        if(!found){
            System.out.println(search+" not found!");
        }
    }
}


