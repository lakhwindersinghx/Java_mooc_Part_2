public class Person {
    public String name;
    public String address;

    public Person(String name,String address){
        this.name=name;
        this.address=address;
    }
    public Person(){

    }

    public String toString(){
        return this.name+"\n"+"   "+this.address;
    }
}
