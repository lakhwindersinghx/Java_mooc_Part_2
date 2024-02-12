public class Bookx {
    private String authName;
    private String title;
    private int count;

    public Bookx(String author, String name, int page){
        this.authName=author;
        this.title=name;
        this.count=page;
    }
    public String getAuthor(){
        return this.authName;
    }

    public String getName(){
        return this.title;
    }
    public int getPages(){
        return this.count;
    }
    public String toString(){
        return this.authName+", "+this.title+", "+this.count+" Pages.";
    }

}
