package aula2.exercicios.exercicio2;

public class AppConfigBuilderImpl implements AppConfigBuilder {
    private AppConfig appConfig;

    public AppConfigBuilderImpl() {
        appConfig = new AppConfig();
    }

    @Override
    public void buildDatabase(String type) {
        appConfig.setDatabaseType(type);
    }

    @Override
    public void buildLogger(String level) {
        appConfig.setLoggerLevel(level);
    }

    @Override
    public void buildExternalService(String service) {
        appConfig.setExternalService(service);
    }

    @Override
    public AppConfig getAppConfig() {
        return appConfig;
    }
}

