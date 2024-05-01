
public class Book implements Comparable<Book> {

    private String name;
    private int age;

    public Book(String name, int age) {
        this.name = name;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString(){
        return this.name+"( Recommended for "+this.age+" year-olds or older)";
    }


    @Override
    public int compareTo(Book o) {
        return this.age-o.getAge();
    }
}