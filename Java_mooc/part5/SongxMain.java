public class SongxMain {
    public static void main(String[] args) {
        Songx jackSparrow = new Songx("The Lonely Island", "Jack Sparrow", 196);
        Songx anotherSparrow = new Songx("The Lonely Island", "Jack Sparrow", 196);

        if (jackSparrow.equals(anotherSparrow)) {
            System.out.println("Songs are equal.");
        }

        if (jackSparrow.equals("Another object")) {
            System.out.println("Strange things are afoot.");
        }
    }
}
