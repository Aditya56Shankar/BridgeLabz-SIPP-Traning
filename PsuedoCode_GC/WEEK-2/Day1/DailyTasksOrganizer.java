import java.util.*;

class DailyTasksOrganizer {
    private LinkedHashMap<Integer, String> tasks = new LinkedHashMap<>();
    private int taskIdCounter = 1; // Auto-generated task ID

    // Add a task
    public void addTask(String description) {
        tasks.put(taskIdCounter, description);
        System.out.println("Task added: " + taskIdCounter + " → " + description);
        taskIdCounter++;
    }

    // Remove a task
    public void removeTask(int taskId) {
        if(tasks.containsKey(taskId)) {
            tasks.remove(taskId);
            System.out.println("Task " + taskId + " removed.");
        } else {
            System.out.println("Task not found!");
        }
    }

    // View all tasks in insertion order
    public void viewTasks() {
        System.out.println("Pending Tasks:");
        for(Map.Entry<Integer, String> entry : tasks.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }

    // Example run
    public static void main(String[] args) {
        DailyTasksOrganizer organizer = new DailyTasksOrganizer();
        
        organizer.addTask("Check emails");
        organizer.addTask("Prepare sales report");
        organizer.addTask("Call client");

        organizer.viewTasks();

        organizer.removeTask(2); // Midday remove

        organizer.viewTasks();
    }
}
