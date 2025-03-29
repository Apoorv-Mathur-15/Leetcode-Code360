package src;

import java.util.ArrayList;
import java.util.Scanner;

public class TodoListApplication {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> todoList = new ArrayList<>();
        String command;

        do {
            System.out.println("Enter command (add/view/remove/exit): ");
            command = sc.nextLine();
            switch (command) {
                case "add":
                    System.out.println("Enter a task to add: ");
                    String task = sc.nextLine();
                    todoList.add(task);
                    System.out.println("Task added.");
                    break;
                case "view":
                    System.out.println("Your tasks: ");
                    for (int i = 1; i < todoList.size() + 1; i++) {
                        System.out.println(i + ". " + todoList.get(i - 1));
                    }
                    break;
                case "remove":
                    System.out.println("Enter task number to remove: ");
                    int index = sc.nextInt() - 1;
                    if (index >= 0 && index < todoList.size()) {
                        todoList.remove(index);
                        System.out.println("Task removed:");
                    } else {
                        System.out.println("Invalid Task Number...");
                    }
                    break;
                case "exit":
                    System.out.println("Exiting... Thank you! ");
                    break;
                default:
                    System.out.println("Invalid command...");
            }
        } while (!command.equalsIgnoreCase("exit"));
    }
}
