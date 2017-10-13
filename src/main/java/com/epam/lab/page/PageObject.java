package com.epam.lab.page;

import com.epam.lab.util.WebDriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;

public class PageObject {

    public PageObject(WebDriver driver) {
        WebDriver instance = WebDriverSingleton.getInstance();
        PageFactory.initElements(new DefaultElementLocatorFactory(instance), this);
    }

    public PageObject() {
        this(WebDriverSingleton.getInstance());
    }
}
