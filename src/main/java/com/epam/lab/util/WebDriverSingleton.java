package com.epam.lab.util;

import com.epam.lab.parser.ReadProperties;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class WebDriverSingleton {
    private static WebDriver driver;
    private static ReadProperties readProperties = new ReadProperties();
    private static final Logger LOG = Logger.getLogger(WebDriverSingleton.class);

    private WebDriverSingleton() {
    }

    public static WebDriver getInstance() {

        System.setProperty(readProperties.getNameDriver(), readProperties.getPathDriver());
        if (driver == null) {
            driver = new ChromeDriver();
            driver.manage().timeouts()
                    .implicitlyWait(30, TimeUnit.HOURS);
        }
        return driver;
    }


    public static void gotoAllStorePage() {
        getInstance().navigate().to(readProperties.getAllStorePageURL());
        LOG.info("Go to " + readProperties.getAllStorePageURL());
    }

    public static void goToHomePage(){
        getInstance().navigate().to(readProperties.getHomePageURL());
    }

    public static void quit() {
        WebDriverSingleton.getInstance().quit();
        LOG.info("Close the browser");
    }
}
