import java.util.ArrayList;
import java.util.Scanner;

public class GradeStatistics {
    public static void main(String[] args) {
        double[] results = GradeStatistics.grades();
        System.out.println("Point average (all): " + results[0] + "\n" +
                (results[1] == 0 ? "Point average (passing): -" : "Point average (passing): " + results[1]) + "\n" +
                "Pass percentage: " + results[2]);
    }

    public static double[] grades() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> allGrades = new ArrayList<>();
        ArrayList<Integer> passingGrades = new ArrayList<>();
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int value = scanner.nextInt();
            if (value == -1) {
                break;
            }
            if (value >= 0 && value <= 100) {
                allGrades.add(value);
            }
            if (value >= 50 && value <= 100) {
                passingGrades.add(value);
            }
        }

        double[] averages = new double[3];
        averages[0] = GradeStatistics.averages(allGrades);
        averages[1] = GradeStatistics.averages(passingGrades);
        averages[2] = GradeStatistics.percentage(passingGrades, allGrades);
        GradeStatistics.gradeDistribution(passingGrades);
        return averages;

    }

    public static int averages(ArrayList<Integer> numbers) {
        int sum = 0;
        int count = 0;
        for (int x : numbers) {
            count++;
            sum += x;
        }
        if (count == 0) {
            return 0;
        }
        return sum / count;
    }

    public static double percentage(ArrayList<Integer> passingGrades, ArrayList<Integer> allGrades) {
        if (allGrades.size() == 0) {
            return 0;
        }
        return (double) passingGrades.size() / allGrades.size() * 100;

    }

    public static void gradeDistribution(ArrayList<Integer> allGrades) {
        int[] distribution = new int[6]; // one extra slot for grades of 100
        for (int grade : allGrades) {
            if (grade < 50) {
                distribution[0]++;
            } else if (grade < 60) {
                distribution[1]++;
            } else if (grade < 70) {
                distribution[2]++;
            } else if (grade < 80) {
                distribution[3]++;
            } else if (grade < 90) {
                distribution[4]++;
            } else {
                distribution[5]++;
            }
        }
        // Print the grade distribution
        System.out.println("Grade distribution:");
        for (int i = 0; i < distribution.length; i++) {
            System.out.print(i + ": ");
            for (int j = 0; j < distribution[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}




