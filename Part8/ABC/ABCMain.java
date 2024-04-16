public class ABCMain {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        a.A();
        b.B();
        c.C();
        System.out.println("xxxxxxxxxxxxxxxxxxxxx");

        c.A();
        c.B();
        c.C();
    }
}
