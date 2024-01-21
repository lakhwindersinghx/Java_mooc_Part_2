    import java.util.ArrayList;

    class printInRange {
        public static void main(String[] args) {
            ArrayList<Integer> numbers = new ArrayList<>();
            numbers.add(3);
            numbers.add(2);
            numbers.add(6);
            numbers.add(-1);
            numbers.add(5);
            numbers.add(1);

            System.out.println("The numbers in the range [0, 5]");
            printNumbersInRange(numbers, 0, 5);

            System.out.println("The numbers in the range [3, 10]");
            printNumbersInRange(numbers, 3, 10);
        }


        public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
//            //program1 expected output.
            for (int item : numbers) {
                if (item >= lowerLimit && item <= upperLimit) {
                    System.out.println(item);
                }
            //program2 correct but unexpected output.
//            for(int item=lowerLimit;item<=upperLimit;item++){
//                if(numbers.contains(item)){
//                System.out.println(item);
//            }
        }
    }
    }
