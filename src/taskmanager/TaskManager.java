package taskmanager;
import java.util.ArrayList;
import java.util.Scanner;
public class TaskManager {
    private ArrayList<Task> tasks;

    public TaskManager() {
        tasks = new ArrayList<>();
    }

    public void  addTask(String title) {
        tasks.add(new Task(title));
    }

    public void showTasks() {
        if (tasks.isEmpty()) {
            System.out.println("There are no tasks");
            return;
        }
        for (Task task : tasks) {
            System.out.println(task);
        }
    }

    public void markTaskDone(int index){
        if(index>=0 && index<tasks.size()){
            tasks.get(index).markDone();
            System.out.println("Task marked done");
        }
        else {
            System.out.println("Index out of bounds");
        }
    }

    public void deleteTask(int index){
        if(index>=0 && index < tasks.size()){
            tasks.remove(index);
            System.out.println("Task deleted");
        } else {
            System.out.println("Index out of bounds");
        }
    }
}
