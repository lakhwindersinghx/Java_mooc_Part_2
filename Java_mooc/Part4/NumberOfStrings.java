import java.util.Scanner;

public class NumberOfStrings {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter some or type end to exit!");
        int counter=0;
        while(true){
            String entry=scanner.nextLine();
            if (entry.equals("end")){
                break;}
            counter++;

            }
        System.out.println(counter);
    }
}
