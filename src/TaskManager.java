import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> tasks;

    public TaskManager() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
        System.out.println("Tarefa adicionada: " + task.getTitle());
    }

    public void listTasks() {
        if (tasks.isEmpty()) {
            System.out.println("Sem tarefas adicionadas.");
        } else {
            System.out.println("Tarefas:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i).toString());
            }
        }
    }

    public void completeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).setCompleted(true);
            System.out.println("Tarefa marcada como concluída: " + tasks.get(index).getTitle());
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public void removeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            Task removedTask = tasks.remove(index);
            System.out.println("Tarefa removida: " + removedTask.getTitle());
        } else {
            System.out.println("Índice inválido.");
        }
    }
}
