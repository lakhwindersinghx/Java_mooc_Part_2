import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;


public class BinarySearch {
    public static void main(String[] args) {
        ArrayList<Integer> books = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            books.add(i);
        }
        System.out.println(books);
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println(BinarySearch.binarySearch(books, 4));
    }

    public static int binarySearch(ArrayList<Integer> books, int searchedId) {
        int beginList = 0;
        int endList = books.size() - 1;
        for (int i = 0; i < books.size(); i++) {

            int middleOfList = (beginList + endList) / 2;
            int middleContent = books.get(middleOfList);

            if (middleContent == searchedId) {
                System.out.println("Searched is at index: ");
                return middleOfList;
            } else if (searchedId < middleContent) {
                endList = middleOfList - 1; // Update end index
            } else {
                beginList = middleOfList + 1; // Update begin index
            }
        }

        return -1;

    }
}
