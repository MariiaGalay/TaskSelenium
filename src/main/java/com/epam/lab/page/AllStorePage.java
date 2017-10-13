package com.epam.lab.page;

import com.epam.lab.util.WebDriverSingleton;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AllStorePage extends PageObject {
    private static final Logger LOG = Logger.getLogger(WebDriverSingleton.class);

    @FindBy(xpath = "//*[@id=\"mn_quickFindBox\"]")
    private WebElement searchBox;

    @FindBy(xpath = ".//*[@href=\"b\"]")
    private WebElement jumpToList;

    @FindBy(xpath = "//div[@class=\"mn_titleBar\"]/a")
    private WebElement scrollTo;

    public boolean verifyFindBox() {
        LOG.info("Search Box is displayed " + searchBox.isDisplayed());
        return searchBox.isDisplayed();
    }

    public void jumpToList() {
        jumpToList.click();
    }

    public void jumpBack() {
        scrollTo.click();
    }


}

