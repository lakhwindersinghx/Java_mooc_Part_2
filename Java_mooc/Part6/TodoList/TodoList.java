import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> list;
    private String name;

    public TodoList(){
        this.list=new ArrayList<>();
    }

    public void add(String task){
        list.add(task);
    }

    public void print(){
        int counter=0;
        for(String item:list){
            counter++;
            System.out.println(counter+". "+item);
        }
    }
    public void remove(int number){
        list.remove(number-1);
    }
}
