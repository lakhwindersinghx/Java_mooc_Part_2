import java.util.ArrayList;

//public class ClockHandMain {
//    public static void main(String[] args) {
//        ClockHand hours = new ClockHand(60);
//        ClockHand minutes = new ClockHand(60);
//        ClockHand seconds = new ClockHand(60);
//
//
//        while (true) {
//            System.out.println("HOURS: " + hours + " MINUTES: " + minutes + " SECONDS: " + seconds);
//            seconds.advance();
//            if (seconds.value()==0) {
//                minutes.advance();
//                if (minutes.value()==0) {
//                    hours.advance();
//                }
//            }
//
//        }
//    }
//}
public class ClockHandMain {

    public static void main(String[] args) {
        Clock clock = new Clock();
        while (!clock.hasPassed()) {
            System.out.println(clock);
            clock.advance();
        }
        System.out.println("1 DAY HAS PASSED!");
    }
}