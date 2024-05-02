package aula2.builder.tasks;

public class TaskManagerSetupDirector {
    private TaskManagerBuilder builder;

    public TaskManagerSetupDirector(TaskManagerBuilder builder) {
        this.builder = builder;
    }

    public void constructTaskManager() {
        builder.buildTaskScheduler();
        builder.buildTaskType();
        builder.enableLogging();
    }

    public TaskManager getTaskManager() {
        return builder.getTaskManager();
    }
}
