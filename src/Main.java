import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nTask Manager Menu:");
            System.out.println("1. Adicionar Tarefa");
            System.out.println("2. Listar Tarefas");
            System.out.println("3. Marcar como concluído");
            System.out.println("4. Remover Tarefa");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Nome da Tarefa: ");
                    String title = scanner.nextLine();
                    System.out.print("Descrição da Tarefa: ");
                    String description = scanner.nextLine();
                    System.out.print("Data (aaaa-mm-dd): ");
                    String dateInput = scanner.nextLine();
                    LocalDate dueDate = LocalDate.parse(dateInput);

                    Task newTask = new Task(title, description, dueDate);
                    taskManager.addTask(newTask);
                    break;
                case 2:
                    taskManager.listTasks();
                    break;
                case 3:
                    System.out.print("Digite o índice da da Tarefa para marcar como concluída: ");
                    int completeIndex = scanner.nextInt();
                    taskManager.completeTask(completeIndex - 1);
                    break;
                case 4:
                    System.out.print("Digite o índice da da Tarefa para remover: ");
                    int removeIndex = scanner.nextInt();
                    taskManager.removeTask(removeIndex - 1);
                    break;
                case 5:
                    System.out.println("Saindo...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
