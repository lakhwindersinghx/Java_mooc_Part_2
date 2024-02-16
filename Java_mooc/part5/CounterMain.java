public class CounterMain {
    public static void main(String[] args) {
    Counter count=new Counter();

        System.out.println(count);
        count.increase();
        System.out.println(count);
        count.increasedBy(50);
        System.out.println(count);
        count.decrease();
        System.out.println(count);
        count.decreasedBy(30);
        System.out.println(count);
    }
}
