
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        // test your method here
        System.out.println("Insert numbers. \"end\" to stop.");
        while (true) {
            String in = scanner.nextLine();
            if (in.equals("end")) {
                break;
            }
            numbers.add(Integer.parseInt(in));
        }
        ArrayList<Integer> positiveNumbers = numbers.stream()
                .filter(number->number>0)
                .collect(Collectors.toCollection(ArrayList::new));

        for(Integer item:positiveNumbers){
            System.out.println(item);
        }
    }
}