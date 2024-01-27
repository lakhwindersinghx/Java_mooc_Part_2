import java.util.Scanner;
import java.nio.file.Paths;

public class PrintingASpecifiedFile {
    public static void main(String[] args)  {
        Scanner entry=new Scanner(System.in);
        String fileName=entry.nextLine();
        try(Scanner scanner = new Scanner(Paths.get("Part4/"+fileName))){
            while(scanner.hasNext()){
                String row=scanner.nextLine();
                System.out.println(row);
            }
        }catch (Exception e){
            System.out.println("Error: "+e);
        }
    }
}