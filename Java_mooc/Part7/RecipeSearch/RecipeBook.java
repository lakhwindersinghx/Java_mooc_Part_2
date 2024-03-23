import java.util.ArrayList;

public class RecipeBook {
    private ArrayList<Recipe> recipes;

    public RecipeBook() {
        this.recipes = new ArrayList<>();
    }

    public void addRecipe(Recipe recipe) {
        recipes.add(recipe);
    }

    public void findRecipe(String keyword) {
        //if recipebook contains a recipe with name that contains searched keyword display it
        for (Recipe item : this.recipes) {
            if (item.getName().contains(keyword)) {
                System.out.println(item);
            }
        }
    }

    public void findByTime(int time) {
        for (Recipe item : this.recipes) {
            if (item.getTime() <= time) {
                System.out.println(item);
            }
        }
    }

    public void findByIngredient(String ingredient) {
        // Search recipes by exact ingredient match
        for (Recipe recipe : recipes) {
            Ingredients ingredients = recipe.getIngredients();
            if (ingredients.containsExactIngredient(ingredient)) {
                System.out.println(recipe);
            }
        }
    }

    public void list() {
        if (recipes.isEmpty()) {
            System.out.println("Recipe book is empty.");
        } else {
            System.out.println("Recipes in the recipe book:");
            for (Recipe recipe : recipes) {
                System.out.println(recipe);
            }
        }
    }
}
