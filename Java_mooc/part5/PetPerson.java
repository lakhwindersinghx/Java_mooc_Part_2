public class PetPerson {
    private String name;
    private Pet pet;

    public PetPerson(String personName,Pet petName){
        this.name=personName;
        this.pet=petName;
    }
    public PetPerson(String personName){
        this(personName,new Pet("Zoro","Desi"));
    }
    public PetPerson(){
        this("Lucky",new Pet("moshu","sexybreed"));
    }
    public String getName(){
        return this.name;
    }

    public String toString(){
        return  this.name+" has a friend "+this.pet.getName() +"("+this.pet.getBreed()+")";
    }
}
