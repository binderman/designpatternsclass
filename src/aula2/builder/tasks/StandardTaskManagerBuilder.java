package aula2.builder.tasks;

public class StandardTaskManagerBuilder implements TaskManagerBuilder {
    private TaskManager taskManager;

    public StandardTaskManagerBuilder() {
        this.taskManager = new TaskManager();
    }

    @Override
    public void buildTaskScheduler() {
        taskManager.setTaskScheduler("Cron Scheduler");
    }

    @Override
    public void buildTaskType() {
        taskManager.setTaskType("Batch Processing");
    }

    @Override
    public void enableLogging() {
        taskManager.setLoggingEnabled(true);
    }

    @Override
    public TaskManager getTaskManager() {
        return taskManager;
    }
}
