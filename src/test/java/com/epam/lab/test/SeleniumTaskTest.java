package com.epam.lab.test;

import com.epam.lab.page.AllStorePage;
import com.epam.lab.page.HomePage;
import com.epam.lab.util.WebDriverSingleton;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class SeleniumTaskTest {
    private AllStorePage allStorePage = new AllStorePage();
    private HomePage homePage = new HomePage();


    @Test
    public void marketPlaceTest() {
        WebDriverSingleton.getInstance();
        WebDriverSingleton.gotoAllStorePage();
        Assert.assertTrue(allStorePage.verifyFindBox());
        allStorePage.jumpToList();
        allStorePage.jumpBack();

        WebDriverSingleton.goToHomePage();
        Assert.assertTrue(homePage.verifyLetterBox());
        homePage.moveToImage();
        homePage.navigateRight();
        homePage.navigateLeft();
        homePage.pressPause();
        homePage.clickImage();
        homePage.clickFirstLink();

    }

    @AfterMethod
    public void close() {
        WebDriverSingleton.quit();
    }
}
