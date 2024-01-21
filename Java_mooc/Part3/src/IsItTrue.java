import java.util.Scanner;

public class IsItTrue {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Username");
        String username=scanner.nextLine();
        System.out.println("Enter Password");
        String password=scanner.nextLine();
        if(username.equals("alex") && password.equals("sunshine")){
            System.out.println("You logged in successfully!");
        }else if(username.equals("emma") && password.equals("haskell")) {
            System.out.println("You logged in successfully!");
        }else{
            System.out.println("WRONG CREDENTIALS!");
        }
            }
    }


