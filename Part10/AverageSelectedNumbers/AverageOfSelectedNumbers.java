import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> inputs = new ArrayList<>();


        while (true) {
            String row = scanner.nextLine();
            if (row.equals("end")){
                break;
            }

            inputs.add(row);
        }


        double negative = inputs.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(number -> number<0)
                .average()
                .getAsDouble();

        double positive = inputs.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(number->number>0)
                .average()
                .getAsDouble();
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String entry=scanner.nextLine();
        if(entry.equals("n")){
            System.out.println(negative);
        }else {
            System.out.println(positive);
        }
    }

}
