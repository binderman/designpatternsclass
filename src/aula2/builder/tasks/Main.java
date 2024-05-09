package aula2.builder.tasks;

public class Main {
    public static void main(String[] args) {
        TaskManagerBuilder builder = new TaskManagerBuilderImpl();
        TaskManagerSetupDirector director = new TaskManagerSetupDirector(builder);
        director.constructTaskManager();
        TaskManager taskManager = director.getTaskManager();
        // Uso do objeto criado
        System.out.println(taskManager);
    }
    
}