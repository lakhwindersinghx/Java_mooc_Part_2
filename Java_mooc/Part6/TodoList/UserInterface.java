import java.util.Scanner;
public class UserInterface {
    private Scanner scanner;
    private TodoList list;

    public UserInterface(TodoList list,Scanner scanner ) {
        this.scanner = scanner;
        this.list = list;
    }

    public void start() {
        while (true) {
            System.out.println();
            System.out.print("Command:");
            String command = scanner.nextLine();
            if (command.equals("stop")) {
                break;
            } else if (command.equals("add")) {
                System.out.print("Add task:");
                String task = scanner.nextLine();
                list.add(task);
            } else if (command.equals("list")) {
                list.print();
            } else if (command.equals("remove")) {
                System.out.println("which task to remove?");
                int taskRemove = scanner.nextInt();
                list.remove(taskRemove);

            }
        }
    }
}
