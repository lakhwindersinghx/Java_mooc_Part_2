public class DecreasingCounterMainProgram {
    public static void main(String[] args) {
        DecreasingCounter decre=new DecreasingCounter(4);
        decre.printValue();
        decre.decrement();
        decre.printValue();
        decre.decrement();

        System.out.println(decre.reset());
    }
}
