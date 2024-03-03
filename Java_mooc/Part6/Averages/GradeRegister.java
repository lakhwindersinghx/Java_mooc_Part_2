import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> grades;
    private ArrayList<Integer> points;

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.points = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrade(points));
        this.points.add(points);

    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }
        return count;
    }
    public double averageOfGrades(){
        if(grades.isEmpty()){
            return -1;
        }
        int totalSumGrades=0;
        int counter=0;
        for(int x:grades){
            counter++;
            totalSumGrades+=x;
        }
        return (double) totalSumGrades /counter;
    }
    public double averageOfPoints(){
        if(points.isEmpty()){
            return -1;
        }
        int totalSumPoints=0;
        int counter=0;
        for(int x:points){
            counter++;
            totalSumPoints+=x;
        }
        return (double) totalSumPoints /counter;
    }

    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }
}