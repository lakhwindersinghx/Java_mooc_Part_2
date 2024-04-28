public class CD implements Packable {
    private String artistName;
    private String cdName;
    private Double weight;
    private int publicationYear;
    public CD(String artistName,String cdName,int publicationYear){
        this.artistName=artistName;
        this.cdName=cdName;
        this.publicationYear=publicationYear;
        this.weight=0.1;
    }

    @Override
    public double weight() {
        return this.weight;
    }

    public String toString(){
        return this.artistName+": "+this.cdName+" "+this.publicationYear;
    }
}
