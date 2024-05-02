package aula2.builder.tasks;

public class Main {
    public static void main(String[] args) {
        TaskManagerBuilder builder = new StandardTaskManagerBuilder();
        TaskManagerSetupDirector director = new TaskManagerSetupDirector(builder);
        director.constructTaskManager();
        TaskManager taskManager = director.getTaskManager();
        System.out.println(taskManager);
    }
    
}