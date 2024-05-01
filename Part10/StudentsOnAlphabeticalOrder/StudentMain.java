

public class StudentMain {

    public static void main(String[] args) {
        Student first = new Student("jamo1");
        Student second = new Student("jamo");
        System.out.println(first.compareTo(second));
    }
}