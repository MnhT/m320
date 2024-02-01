package D3;

// Hauptklasse, die Delegation verwendet
public class TodoList implements TaskDelegate {
    private TaskDelegate taskDelegate;

    public TodoList(TaskDelegate taskDelegate) {
        this.taskDelegate = taskDelegate;
    }

    @Override
    public void addTask(String task) {
        taskDelegate.addTask(task);
    }

    @Override
    public void removeTask(String task) {
        taskDelegate.removeTask(task);
    }

    @Override
    public void setTaskTime(String task, String time) {
        taskDelegate.setTaskTime(task, time);
    }

    public static void main(String[] args) {
        // Verwendung der ToDo-Liste mit Delegation
        TaskManager taskManager = new TaskManager();
        TodoList todoList = new TodoList(taskManager);

        todoList.addTask("Einkaufen");
        todoList.addTask("Aufräumen");
        todoList.setTaskTime("Einkaufen", "14:00");
        todoList.removeTask("Aufräumen");
    }
}
