package aula2.builder.tasks;

public class TaskManager {
    private String taskScheduler;
    private String taskType;
    private boolean isLoggingEnabled;

    @Override
    public String toString() {
        return "TaskManager{" +
               "taskScheduler='" + taskScheduler + '\'' +
               ", taskType='" + taskType + '\'' +
               ", isLoggingEnabled=" + isLoggingEnabled +
               '}';
    }

    public void setTaskScheduler(String taskScheduler) {
        this.taskScheduler = taskScheduler;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    public void setLoggingEnabled(boolean loggingEnabled) {
        isLoggingEnabled = loggingEnabled;
    }
}

