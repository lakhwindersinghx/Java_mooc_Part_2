import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LimitedNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        System.out.println("Insert numbers. negative number to stop.");
        while (true) {
            Integer in = scanner.nextInt();
            if (in<0) {
                break;
            }
            numbers.add(Integer.valueOf(in));
        }
        ArrayList<Integer> filter=numbers.stream()
                .filter(value->value>=1&&value<=5)
                .collect(Collectors.toCollection(ArrayList::new));

        filter.stream()
                .forEach(element-> System.out.println(element));

    }
}
