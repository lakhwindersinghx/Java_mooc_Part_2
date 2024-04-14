public class SimpleDateMain {
    public static void main(String[] args) {
        // Create SimpleDate objects
        SimpleDate date1 = new SimpleDate(1, 1, 2022);
        SimpleDate date2 = new SimpleDate(2, 1, 2022);
        SimpleDate date3 = new SimpleDate(1, 1, 2022); // Same date as date1

        // Display the hash codes
        System.out.println("Hash code for date1: " + date1.hashCode());
        System.out.println("Hash code for date2: " + date2.hashCode());
        System.out.println("Hash code for date3: " + date3.hashCode());

        // Check equality of hash codes
        System.out.println("Hash code equality between date1 and date2: " + (date1.hashCode() == date2.hashCode()));
        System.out.println("Hash code equality between date1 and date3: " + (date1.hashCode() == date3.hashCode()));
    }
}
