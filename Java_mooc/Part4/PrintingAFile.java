import java.util.Scanner;
import java.nio.file.Paths;

public class PrintingAFile {
    public static void main(String[] args)  {
        try(Scanner scanner = new Scanner(Paths.get("Part4/data.txt"))){
            while(scanner.hasNext()){
                String row=scanner.nextLine();
                System.out.println(row);
            }
        }catch (Exception e){
            System.out.println("Error: "+e);
        }
    }
}