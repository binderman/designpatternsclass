package aula1.singleton;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;

public class Configuration {
    private static Configuration instance;
    private Properties settings;

    private Configuration() {
        settings = new Properties();
        try (FileInputStream fileInputStream = 
                new FileInputStream("config.properties")) {
            settings.load(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
    }

    public static synchronized Configuration getInstance() {
        if (instance == null) {
            instance = new Configuration();
        }
        return instance;
    }

    public String getProperty(String key) {
        return settings.getProperty(key);
    }
}

