public class EqualsMain {
    public static void main(String[] args) {
        Equals.Notepad basics = new Equals.Notepad("Equals basics", 2000);
        Equals.Notepad advanced = new Equals.Notepad("Equals advanced", 2001);

        System.out.println(basics.equals(basics));
        System.out.println(basics.equals(advanced));
        System.out.println(basics.equals(new Equals.Notepad("Equals basics", 2000)));
        System.out.println(basics.equals(new Equals.Notepad("Equals basics", 2001)));
    }

}
