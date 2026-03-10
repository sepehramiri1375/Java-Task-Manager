package taskmanager;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskManager manager = new TaskManager();

        while (true) {
            System.out.println("Welcome to TaskManager");
            System.out.println("1. Add Task");
            System.out.println("2. View Task");
            System.out.println("3. Mark task as done");
            System.out.println("4. Delete tasks");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter task name: ");
                    String title = scanner.nextLine();
                    manager.addTask(title);
                    break;
                case 2:
                    manager.showTasks();
                    break;

                case 3:
                    manager.showTasks();
                    System.out.print("Enter task number to mark as done: ");
                    int doneIndex = scanner.nextInt();
                    scanner.nextLine();
                    manager.markTaskDone(doneIndex-1);
                    break;

                case 4:
                    manager.showTasks();
                    System.out.print("Enter task number to delete: ");
                    int deletIndex = scanner.nextInt();
                    scanner.nextLine();
                    manager.deleteTask(deletIndex - 1);
                    break;

                case 5:
                    System.out.print("Finish: ");
                    scanner.close();
                    return;

                    default:
                        System.out.println("Invalid choice");
            }
        }
    }
}
