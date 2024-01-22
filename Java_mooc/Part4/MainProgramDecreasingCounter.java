public class MainProgramDecreasingCounter {
    public static void main(String[] args) {
        decreasingCounter decre=new decreasingCounter(4);
        decre.printValue();
        decre.decrement();
        decre.printValue();
        decre.decrement();

        System.out.println(decre.reset());
    }
}
