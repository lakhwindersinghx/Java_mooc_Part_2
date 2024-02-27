public class Archive {
    private String identifier;
    private String name;

    public Archive(String identifier,String itemName){
        this.identifier=identifier;
        this.name=itemName;
    }

    public String getName(){
        return this.name;
    }
    public String getIdentifier(){
        return this.identifier;
    }
    public boolean equals(Object compared){
        if(this == compared){
            return true;
        }

        if(!(compared instanceof Archive)){
            return false;
        }

        Archive comItems = (Archive) compared;
        if(this.name.equals(comItems.name) && this.identifier.equals( comItems.identifier)){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return this.identifier+": "+this.name;
    }
}
