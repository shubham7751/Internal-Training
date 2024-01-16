package com.hybf.utilitys;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configuration {

    Properties properties;

    String pro_path = "C:\\Users\\NTS-ShubhamJawale\\Downloads\\HybridFramework_POM-master\\HybridFramework_POM-master\\HybridFramework\\src\\main\\resources\\configuration\\config.properties";

    public Configuration() {
        properties = new Properties();

        FileInputStream ip = null;

        try {
            ip = new FileInputStream(pro_path);
            properties.load(ip);
        } catch (Exception e) {
            throw new RuntimeException(e);


        }


    }


    public String getUrl() {

        String url = properties.getProperty("url");
        return url;
    }


    public String getBrowser() {

        String browser = properties.getProperty("browser");
        return browser;
    }
}
