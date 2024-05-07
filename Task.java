import java.util.ArrayList;
import java.util.Scanner;

class Task {
    private String name;
    private boolean completed;

    public Task(String name) {
        this.name = name;
        this.completed = false;
    }

    public String getName() {
        return name;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}

public class TaskManager {
    private ArrayList<Task> tasks;

    public TaskManager() {
        tasks = new ArrayList<>();
    }

    public void addTask(String name) {
        tasks.add(new Task(name));
        System.out.println("Task added: " + name);
    }

    public void deleteTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            Task removedTask = tasks.remove(index);
            System.out.println("Task removed: " + removedTask.getName());
        } else {
            System.out.println("Invalid task index");
        }
    }

    public void markTaskAsCompleted(int index) {
        if (index >= 0 && index < tasks.size()) {
            Task task = tasks.get(index);
            task.setCompleted(true);
            System.out.println("Task marked as completed: " + task.getName());
        } else {
            System.out.println("Invalid task index");
        }
    }

    public void displayTasks() {
        System.out.println("Tasks:");
        for (int i = 0; i < tasks.size(); i++) {
            Task task = tasks.get(i);
            System.out.println((i + 1) + ". " + task.getName() + (task.isCompleted() ? " (Completed)" : ""));
        }
    }

    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nTask Manager Menu:");
            System.out.println("1. Add Task");
            System.out.println("2. Delete Task");
            System.out.println("3. Mark Task as Completed");
            System.out.println("4. Display Tasks");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter task name: ");
                    String taskName = scanner.nextLine();
                    taskManager.addTask(taskName);
                    break;
                case 2:
                    System.out.print("Enter index of task to delete: ");
                    int deleteIndex = scanner.nextInt() - 1;
                    taskManager.deleteTask(deleteIndex);
                    break;
                case 3:
                    System.out.print("Enter index of task to mark as completed: ");
                    int completeIndex = scanner.nextInt() - 1;
                    taskManager.markTaskAsCompleted(completeIndex);
                    break;
                case 4:
                    taskManager.displayTasks();
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }

        scanner.close();
    }
}
