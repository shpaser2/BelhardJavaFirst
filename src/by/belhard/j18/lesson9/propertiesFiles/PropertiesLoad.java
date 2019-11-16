package by.belhard.j18.lesson9.propertiesFiles;


import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesLoad {
    private static final Properties properties = new Properties();

    static {
        try {
            properties.load(new FileReader("props.properties"));
        } catch (IOException e) {
            System.err.println("No properties file!");
        }
    }

    public static void main(String[] args) {

        System.out.println("appname: " + properties.getProperty("app.name"));
        System.out.println("version: " + properties.getProperty("app.version"));
        System.out.println("key: " + properties.getProperty("key"));
    }
}