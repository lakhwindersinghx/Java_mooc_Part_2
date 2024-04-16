public class Student extends Person {
    public Integer credit;

    public Student(String name,String address){
        super(name,address);
        this.credit=0;
    }

    public String credits(){
        return ""+this.credit;
    }
    public void study(){
        this.credit++;
    }
    public String toString(){
        return this.name+"\n"+"   "+this.address+"\n"+"   Study credits "+this.credit;
    }
}

