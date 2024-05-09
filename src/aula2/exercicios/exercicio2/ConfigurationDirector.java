package aula2.exercicios.exercicio2;

public class ConfigurationDirector {
    private AppConfigBuilder builder;

    public ConfigurationDirector(AppConfigBuilder builder) {
        this.builder = builder;
    }

    public void construct(String dbType, String logLevel, String service) {
        builder.buildDatabase(dbType);
        builder.buildLogger(logLevel);
        builder.buildExternalService(service);
    }

    public AppConfig getConfiguration() {
        return builder.getAppConfig();
    }
}
