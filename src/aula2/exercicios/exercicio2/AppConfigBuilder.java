package aula2.exercicios.exercicio2;

public interface AppConfigBuilder {
    void buildDatabase(String type);
    void buildLogger(String level);
    void buildExternalService(String service);
    AppConfig getAppConfig();
}