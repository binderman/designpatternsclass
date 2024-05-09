package aula2.exercicios.exercicio2;

public class AppConfigMain {
    public static void main(String[] args) {
        AppConfigBuilder builder = new AppConfigBuilderImpl();
        ConfigurationDirector director = new ConfigurationDirector(builder);

        director.construct("SQL", "DEBUG", "EmailService");
        AppConfig config = director.getConfiguration();
        System.out.println(config);
    }
}
