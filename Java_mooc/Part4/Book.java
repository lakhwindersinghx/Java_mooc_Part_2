public class Book {
    private String title;
    private int pages;
    private int year;
    public Book(String bookTitle,int bookPages,int bookYear){
        this.title=bookTitle;
        this.pages=bookPages;
        this.year=bookYear;
    }
    public String getTitle(){
        return this.title;
    }
    public int getPages(){
        return this.pages;
    }
    public int getYear(){
        return this.year;
    }
    public String toString(){
        return this.title + ", " + this.pages + " pages, " + this.year;
    }
}
