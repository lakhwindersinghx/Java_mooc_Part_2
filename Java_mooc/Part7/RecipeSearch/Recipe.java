public class Recipe{
    private String name;
    private int time;
    private Ingredients ingredientsList;

    public Recipe(String name,int time,Ingredients ingredientsList){
        this.name=name;
        this.time=time;
        this.ingredientsList=ingredientsList;
    }
    public Recipe(String name,int time){
        this.name=name;
        this.time=time;
    }
    public Recipe(String name){
        this.name=name;
    }

    public String getName(){
        return this.name;
    }
    public Integer getTime(){
        return this.time;
    }

    public String toString(){
        return this.name+", "+"cooking time: "+this.time;
    }

    public Ingredients getIngredients() {
        return this.ingredientsList;
    }
}