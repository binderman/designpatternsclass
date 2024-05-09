package aula2.exercicios.exercicio2;

public class AppConfig {
    private String databaseType;
    private String loggerLevel;
    private String externalService;

    // Getters and setters
    public void setDatabaseType(String databaseType) {
        this.databaseType = databaseType;
    }

    public void setLoggerLevel(String loggerLevel) {
        this.loggerLevel = loggerLevel;
    }

    public void setExternalService(String externalService) {
        this.externalService = externalService;
    }

    @Override
    public String toString() {
        return "AppConfig{" +
               "databaseType='" + databaseType + '\'' +
               ", loggerLevel='" + loggerLevel + '\'' +
               ", externalService='" + externalService + '\'' +
               '}';
    }
}