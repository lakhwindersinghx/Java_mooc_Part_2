public class TimerMain {
    public static void main(String[] args) {

        Timer test = new Timer();

        while (true) {
            System.out.println(test);
            test.timerOn();
        }
    }
}