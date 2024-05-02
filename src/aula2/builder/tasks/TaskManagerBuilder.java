package aula2.builder.tasks;

public interface TaskManagerBuilder {
    void buildTaskScheduler();
    void buildTaskType();
    void enableLogging();
    TaskManager getTaskManager();
}
