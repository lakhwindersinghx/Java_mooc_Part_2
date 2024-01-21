import java.util.Scanner;
public class NameOfTheOldest {
    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    int max=0;
    String name="";

    while(true){
        String entry=scanner.nextLine();
        if(entry.isEmpty()){
            break;
        }

        String[] values=entry.split(",");
        int age=Integer.parseInt(values[1]);
        if(max<age){
            max=age;
            name=values[0];
        }
    }
        System.out.println(name);
    }
}
