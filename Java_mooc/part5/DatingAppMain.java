public class DatingAppMain {
    public static void main(String[] args) {
        DatingApp date = new DatingApp(28, 2, 2015);
        System.out.println("Friday of the examined week is " + date);
        date.advance();
        date.advance(790);
        System.out.println("New date: "+date);
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

        DatingApp now = new DatingApp(13, 2, 2015);
        DatingApp afterOneWeek = now;
        afterOneWeek.advance(7);

        System.out.println("Now: " + now);
        System.out.println("After one week: " + afterOneWeek);
    }
}
