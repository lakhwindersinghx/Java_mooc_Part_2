public class PetMain {
    public static void main(String[] args) {
        Pet lucy = new Pet("Lucy", "golden retriever");
        PetPerson leo = new PetPerson("Leo", lucy);
        System.out.println(leo);
    }
}
