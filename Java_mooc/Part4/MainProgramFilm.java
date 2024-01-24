import java.util.Scanner;
public class MainProgramFilm {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Film xxx=new Film("Stringendo",18);

        System.out.println("What's your age?");
        int age=scanner.nextInt();

        System.out.println();
        if (age >= xxx.ageRating()) {
            System.out.println("You may watch the film " + xxx.name());
        } else {
            System.out.println("You may not watch the film " + xxx.name());
        }
    }
}
