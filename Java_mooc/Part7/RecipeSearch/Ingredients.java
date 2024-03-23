import java.util.ArrayList;

public class Ingredients {
    private ArrayList<String> ingredients;

    public Ingredients(ArrayList<String> ingredients) {
        this.ingredients = new ArrayList<>();
    }

    public void addIngredients(String item) {
        this.ingredients.add(item);
    }

    public boolean containsExactIngredient(String ingredient) {
        for (String item : ingredients) {
            if (item.equals(ingredient)) {
                return true;
            }
        }
        return false;
    }
}