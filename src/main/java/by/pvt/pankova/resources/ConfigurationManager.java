package by.pvt.pankova.resources;

import java.util.ResourceBundle;

public class ConfigurationManager {

    private static final ResourceBundle resourceBundle = ResourceBundle.getBundle("configuration");

    private ConfigurationManager() {
    }

    public static String getProperty(String key) {
        return resourceBundle.getString(key);
    }
}