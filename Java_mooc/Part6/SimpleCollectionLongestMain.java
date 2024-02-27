public class SimpleCollectionLongestMain {
    public static void main(String[] args) {
        SimpleCollectionLongest j = new SimpleCollectionLongest("characters");
        System.out.println("Longest: " + j.longest());

        j.add("magneto");
        j.add("mystique");
        j.add("phoenix");

        System.out.println("Longest: " + j.longest());
    }
}
