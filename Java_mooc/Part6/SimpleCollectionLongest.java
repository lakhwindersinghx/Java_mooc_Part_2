import java.util.ArrayList;

public class SimpleCollectionLongest {
    private String name;
    private ArrayList<String> elements;

    public SimpleCollectionLongest(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String longest() {
        if (this.elements.isEmpty()){
            return null;
        }
        String longest="";
        int longestString=0;
        for(String item:this.elements){
            if(longestString<item.length()){
                longestString=item.length();
                longest=item;
            }
        }
        return longest;
    }
}


