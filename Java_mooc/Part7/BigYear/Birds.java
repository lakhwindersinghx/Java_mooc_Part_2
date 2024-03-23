

public class Birds {
    private String name;
    private String latin;
    private int observation;

    public Birds(String name,String latin){
        this.name=name;
        this.latin=latin;
        this.observation=0;
    }

    public String getName(){
        return this.name;
    }
    public String getLatin(){
        return this.latin;
    }
    public void addObservation(){
        this.observation+=1;
    }


    public String toString(){
        return this.name+" ("+this.latin+")"+":"+this.observation+" observations";
    }

}

