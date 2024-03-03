import java.util.ArrayList;
import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start() {
        while (true) {
            System.out.print("Command:");
            String command = scanner.nextLine();
            if (command.equals("end")) {
                System.out.println("BYE BYE!");
                break;
            }
            else if(command.equals("add")){
                System.out.print("Add word:");
                String add=scanner.nextLine();
                System.out.print("Translation:");
                String translation= scanner.nextLine();
                dictionary.add(add,translation);
            }
            else if(command.equals("search")){
                System.out.print("To be translated:");
                String toBeTranslated= scanner.nextLine();
                String translatedWord=dictionary.translate(toBeTranslated);
                if(translatedWord==null){
                    System.out.println("word "+toBeTranslated+" is not found!");
                }else{
                    System.out.print("Translation:"+ translatedWord);
                    System.out.println();
                }
            }
             else {
                System.out.println("UNKNOWN COMMAND!");
            }

        }
    }
}
