public class Main {
    public static void main(String[] args) {
        RecipeBook newBook=new RecipeBook();
        UserInterface ui=new UserInterface(newBook);
        ui.start();
    }
}
