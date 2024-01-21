import java.util.Scanner;
public class PersonalDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int longestName = 0;
        String name = "";
        double averageOfBirth = 0;
        int counter=0;
        int sumBirthYears=0;
        while (true) {
            String entry = scanner.nextLine();
            if (entry.isEmpty()) {
                break;
            }
            String[] values = entry.split(",");
            int birthYear = Integer.parseInt(values[1]);
            counter++;
            sumBirthYears+=birthYear;

            int lengthOfName = values[0].length();
            averageOfBirth=1.0*sumBirthYears/counter;

            if (longestName < lengthOfName) {
                longestName=lengthOfName;
                name=values[0];
            }
            }
            System.out.println("longest name: "+name);
            System.out.println("Average of years: "+averageOfBirth);
        }
    }

