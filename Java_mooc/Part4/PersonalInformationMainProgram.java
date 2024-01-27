import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationMainProgram {
    public static void main(String[] args) {

        ArrayList<PersonalInformation> details = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter details or press enter to exit:");
        while (true) {
            String entry = scanner.nextLine();
            if(entry.isEmpty())
                break;
            PersonalInformation information=new PersonalInformation(entry);

            details.add(information);
            }
        for(PersonalInformation item:details){
            System.out.println(item);
        }
        }
    }

