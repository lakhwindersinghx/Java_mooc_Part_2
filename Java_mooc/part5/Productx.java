public class Productx {
    private String name;
    private String location;
    private int weight;

    public Productx(String name,String location, int weight){
        this.name=name;
        this.location=location;
        this.weight=weight;
    }
    public Productx(String name){
    this(name,"shelf",1);
    }
    public Productx(String name, String location){
    this(name,location,30);
    }
    public Productx(String name, int weight){
        this(name,"shelf",30);
    }
    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.weight + " kg) can be found from the " + this.location;
    }
}

