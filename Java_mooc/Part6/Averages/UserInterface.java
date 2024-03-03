import java.util.Scanner;

public class UserInterface {
    private GradeRegister register;
    private Scanner scanner;

    public UserInterface(GradeRegister register, Scanner scanner) {
        this.scanner = scanner;
        this.register = register;
    }

    public void start() {
        readpoints();
        System.out.println();
        printGradeDistribution();
    }

    public void readpoints() {
        while (true) {
            System.out.println("Points: ");
            int points = scanner.nextInt();
            if (points < 0 || points > 100) {
                System.out.println("INCORRECT VALUE 0-100 ACCEPTABLE");
                break;
            }
            this.register.addGradeBasedOnPoints(points);
        }
        System.out.println(register.averageOfGrades());
        System.out.println(register.averageOfPoints());
    }


    public void printGradeDistribution() {
        int grade = 5;
        while (grade >= 0) {
            int stars = register.numberOfGrades(grade);
            System.out.print(grade + ": ");
            printStars(stars);
            System.out.println("");

            grade = grade - 1;
        }
    }

    public static void printStars(int stars) {
        while (stars > 0) {
            System.out.print("*");
            stars--;
        }
    }
}

