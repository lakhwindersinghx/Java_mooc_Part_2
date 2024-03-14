import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        ArrayList<Integer> books=new ArrayList<>();
        books.add(10);
        books.add(20);
        books.add(30);
        books.add(40);
        books.add(50);
        System.out.println(LinearSearch.linearSearch(books,90));

    }
    public static int linearSearch(ArrayList<Integer> books, int searchedId){
       for(int i=0;i<books.size();i++){
           if(searchedId==books.get(i)){
               return i;
           }
       }
       return -1;
    }
}
