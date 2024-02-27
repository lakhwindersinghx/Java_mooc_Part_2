public class IdenticalTwins {
    public static void main(String[] args) {


        SimpledateForTwins date = new SimpledateForTwins(24, 3, 2017);
        SimpledateForTwins date2 = new SimpledateForTwins(23, 7, 2017);

        PersonForTwins leo = new PersonForTwins("Leo", date, 62, 9);
        PersonForTwins lily = new PersonForTwins("Lily", date2, 65, 8);

        if (leo.equals(lily)) {
            System.out.println("Is this quite correct?");
        }

        PersonForTwins leoWithDifferentWeight = new PersonForTwins("Leo", date, 62, 10);

        if (leo.equals(leoWithDifferentWeight)) {
            System.out.println("Is this quite correct?");
        }
    }
}