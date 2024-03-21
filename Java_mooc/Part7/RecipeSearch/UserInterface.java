
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;

public class UserInterface {
    private Scanner scanner;
    private RecipeBook book;

    UserInterface(RecipeBook book) {
        this.scanner = new Scanner(System.in);
        this.book = book;
    }

    //    File to read: recipes.txt
    public void start() {
        fileRead();
        while (true) {
            System.out.println("""
                    Commands:
                    list - lists the recipes
                    stop - stops the program
                    find name - searches recipes by name
                    find cooking time - searches recipes by cooking time
                    find ingredient - searches recipes by ingredient""");

            System.out.print("Enter command: ");
            String command = this.scanner.nextLine();
            if (command.equals("list")) {
                //call the list function.
                this.book.list();
            }
            if (command.equals("stop")) {
                //exits the program
                break;
            }
            if (command.equals("find name")) {
                System.out.print("Searched word: ");
                String find = scanner.nextLine();
                this.book.findRecipe(find);
            }
            if (command.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                int searchTime = Integer.parseInt(scanner.nextLine());
                this.book.findByTime(searchTime);
            }
            if (command.equals("find ingredient ")) {
                System.out.print("Ingredient: ");
                String searchIngredient = scanner.nextLine();
                this.book.findByIngredient(searchIngredient);
            }

        }
    }

    public void fileRead() {
        try (Scanner reader = new Scanner(Paths.get("Part7/RecipeSearch/recipes.txt"))) {

            //FIRST PARSING THE RECIPE AND COOKING TIME.
            while (reader.hasNextLine()) {
                String recipeName = reader.nextLine();
                int cookingTime = Integer.parseInt(reader.nextLine());
                //PARSING THE INGREDIENTS NOW.
                ArrayList<String> ingredientsList = new ArrayList<>();
                while (reader.hasNextLine()) {
                    String ingredients = reader.nextLine();
                    if (ingredients.isEmpty()) {
                        break;
                    }
                    ingredientsList.add(ingredients);
                }
                //ADDING TO THE RECIPE BOOK.
                Ingredients ingredients = new Ingredients(ingredientsList);
                this.book.addRecipe(new Recipe(recipeName, cookingTime, ingredients));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}