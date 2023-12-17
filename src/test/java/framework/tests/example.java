package framework.tests;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.browser.Browser;
import framework.pages.AddRemovePage;
import framework.pages.MainPage;
import framework.pages.MainPageNavigation;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Properties;


public class example extends BaseTest {

    @Test
    public void unsuccessfulLoginTest() {
//        MainPage mainPage = new MainPage();
        mainPage.clickNavigationLink(MainPageNavigation.ADD_REMOVE_PAGE);

        AddRemovePage addRemovePage = new AddRemovePage();
        addRemovePage.clickAddElementBtn();
        Assert.assertTrue(addRemovePage.isDeleteElementBtnDisplayed(), "delete button is not displayed");

        addRemovePage.clickDeleteElementBtn();

        Assert.assertFalse(addRemovePage.isDeleteElementBtnExists(), "Delete button is present");
    }


}

