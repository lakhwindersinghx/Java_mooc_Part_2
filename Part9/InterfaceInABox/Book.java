public class Book implements Packable{
    private String bookName;
    private String authorName;
    private double weight;
    public Book(String bookName,String authorName,double weight){
        this.authorName=authorName;
        this.bookName=bookName;
        this.weight=weight;


    }
    public double weight() {
        return this.weight;
    }
    public String toString(){
        return this.authorName+": "+this.bookName;
    }
}
