
public class Books {

    private String name;
    private int publicationYear;

    public Books(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public boolean equals(Object compared){
        if(this == compared){
            return true;
        }

        if(!(compared instanceof Books)){
            return false;
        }

        Books comBook = (Books) compared;

        if(this.name.equals(comBook.name) && this.publicationYear == comBook.publicationYear){
            return true;
        }

        return false;
    }

}