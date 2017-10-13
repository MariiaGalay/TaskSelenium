package com.epam.lab.parser;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
    private static String PATH_PROPERTIES = "src\\main\\resources\\util.properties";
    private Properties properties;

    public ReadProperties() {
        properties = new Properties();
        try {
            properties.load(new FileInputStream
                    (new File(PATH_PROPERTIES)));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getPathDriver() {
        return properties.getProperty("pathFirefoxDriver");
    }

    public String getNameDriver() {
        return properties.getProperty("nameFirefoxDriver");
    }

    public String getAllStorePageURL() {
        return properties.getProperty("AllStorePageURL");
    }

    public String getHomePageURL() {
        return properties.getProperty("HomePageURL");
    }
}
