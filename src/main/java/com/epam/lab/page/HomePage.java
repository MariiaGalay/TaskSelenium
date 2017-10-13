package com.epam.lab.page;

import com.epam.lab.util.WebDriverSingleton;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageObject {
    private Actions action = new Actions(WebDriverSingleton.getInstance());
    @FindBy(xpath = "//*@letterbox")
    private WebElement letterBox;

    @FindBy(xpath = "//*[@id=\"mn_sec10174_pos\"]/div[2]/img")
    private WebElement imageArea;

    @FindBy(xpath = "//*[@id=\"mn_h\"]/div[3]/div/div[2]/div[1]/div[2]/div/div[1]/button[2]")
    private WebElement arrowRight;

    @FindBy(xpath = "//div[@class='mn_itemsWrap slick-initialized slick-slider']/button[2]")
    private WebElement arrowLeft;

    @FindBy(xpath = "//div[@class = 'fa fa-pause'")
    private WebElement pause;

    @FindBy(xpath = "//*[@class= 'tracking-target js-eint-exitLink']")
    private WebElement firstLinkFooter;

    public boolean verifyLetterBox() {
        return letterBox.isDisplayed();
    }

    public void moveToImage() {
        action.moveToElement(imageArea).perform();
    }

    public void navigateRight() {
        arrowRight.click();
    }

    public void navigateLeft() {
        arrowLeft.click();
    }

    public void pressPause() {
        pause.click();
    }

    public void clickImage() {
        imageArea.click();
        WebDriverSingleton.getInstance().navigate().back();
    }

    public void clickFirstLink() {
        firstLinkFooter.click();
        WebDriverSingleton.getInstance().navigate().back();
    }

}
