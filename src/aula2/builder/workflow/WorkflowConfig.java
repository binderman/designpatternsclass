package aula2.builder.workflow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WorkflowConfig {
    private String startService;
    private String endService;
    private Map<String, String> tasks;
    private List<String> conditions;

    public static class Builder {
        private String startService;
        private String endService;
        private Map<String, String> tasks = new HashMap<>();
        private List<String> conditions = new ArrayList<>();

        public Builder startService(String startService) {
            this.startService = startService;
            return this;
        }

        public Builder endService(String endService) {
            this.endService = endService;
            return this;
        }

        public Builder addTask(String taskName, String service) {
            tasks.put(taskName, service);
            return this;
        }

        public Builder addCondition(String condition) {
            conditions.add(condition);
            return this;
        }

        public WorkflowConfig build() {
            return new WorkflowConfig(this);
        }
    }

    private WorkflowConfig(Builder builder) {
        this.startService = builder.startService;
        this.endService = builder.endService;
        this.tasks = builder.tasks;
        this.conditions = builder.conditions;
    }

    @Override
    public String toString() {
        return "WorkflowConfig{" +
               "startService='" + startService + '\'' +
               ", endService='" + endService + '\'' +
               ", tasks=" + tasks +
               ", conditions=" + conditions +
               '}';
    }
}


