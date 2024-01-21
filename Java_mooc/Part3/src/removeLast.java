import java.util.ArrayList;
public class removeLast {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();

        strings.add("First");
        strings.add("Second");
        strings.add("Third");

        System.out.println(strings);

        removeLast(strings);
        removeLast(strings);

        System.out.println(strings);
    }
    public static void removeLast(ArrayList<String> list){
       if(list.isEmpty()){
           return;
       }
       list.remove(list.size()-1);
    }
}

