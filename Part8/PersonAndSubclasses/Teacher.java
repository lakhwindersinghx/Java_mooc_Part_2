public class Teacher extends Student {
    private Integer salary;

    public Teacher(String name,String address,Integer salary){
        super(name,address);
        this.salary=salary;
    }

    public String toString(){
        return this.name+"\n"+"   "+this.address+"\n"+"   salary "+this.salary+"euro/month" ;
    }

}
