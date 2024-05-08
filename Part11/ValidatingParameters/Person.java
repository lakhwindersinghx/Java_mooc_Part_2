public class Person {
    private String name;
    private int age;

    public Person(String name,int age){
        if(name.length()>40||name.isEmpty()){
            throw new IllegalArgumentException("Incorrect name!");
        }
        this.name=name;
        if(age<0||age>120){
            throw new IllegalArgumentException("Invalid age");
        }
        this.age=age;
    }

    public String toString(){
        return this.name;
    }

}
