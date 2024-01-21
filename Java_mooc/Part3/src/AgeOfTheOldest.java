import java.util.Scanner;
public class AgeOfTheOldest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int max=0;
        while(true){
            String entry=scanner.nextLine();
            if(entry.isEmpty()){
                break;
            }
            String[] pieces = entry.split(",");
            int age = Integer.parseInt(pieces[1]);
            if(max < age){
                max = age;

            }
            }
        System.out.println(max);

        }
    }

