import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Literature {
    public static void main(String[] args) {
        List<Book> bookList = getBookData();

        Comparator<Book> comparator = Comparator
                .comparing(Book::getName)
                .thenComparing(Book::getAge);

        bookList.stream().sorted()
                .forEach(row-> System.out.println(row));
    }
    public static List<Book> getBookData(){
        List<Book> data=new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("Input the name of the book, empty stops: ");
            String bookName = scanner.nextLine();
            if(bookName.equals("")){
                break;
            }
            System.out.print("Input the age recommendation: ");
            int ageRecommendation=Integer.parseInt(scanner.nextLine());
            System.out.println();
            data.add(new Book(bookName,ageRecommendation));

        }
        System.out.println(data.size()+" books in total.");
        return data;
    }
}
