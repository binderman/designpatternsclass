package aula2.builder.tasks;

public class TaskManagerBuilderImpl implements TaskManagerBuilder {
    private TaskManager taskManager;

    public TaskManagerBuilderImpl() {
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
