package D3;

import java.util.ArrayList;
import java.util.List;

// Interface für die Delegation
interface TaskDelegate {
    void addTask(String task);
    void removeTask(String task);
    void setTaskTime(String task, String time);
}

// Klasse, die die eigentliche Arbeit erledigt
class TaskManager implements TaskDelegate {
    private List<String> tasks = new ArrayList<>();
    private List<String> times = new ArrayList<>();

    @Override
    public void addTask(String task) {
        tasks.add(task);
        System.out.println("Aufgabe hinzugefügt: " + task);
    }

    @Override
    public void removeTask(String task) {
        if (tasks.contains(task)) {
            int index = tasks.indexOf(task);
            tasks.remove(index);

            if (index < times.size()) {
                times.remove(index);
            }

            System.out.println("Aufgabe entfernt: " + task);
        } else {
            System.out.println("Aufgabe nicht gefunden: " + task);
        }
    }

    @Override
    public void setTaskTime(String task, String time) {
        if (tasks.contains(task)) {
            int index = tasks.indexOf(task);
            if (index < times.size()) {
                times.set(index, time);
                System.out.println("Zeit für Aufgabe gesetzt - Aufgabe: " + task + ", Zeit: " + time);
            } else {
                System.out.println("Ungültiger Index für Zeitliste: " + index);
            }
        } else {
            System.out.println("Aufgabe nicht gefunden: " + task);
        }
    }
}



