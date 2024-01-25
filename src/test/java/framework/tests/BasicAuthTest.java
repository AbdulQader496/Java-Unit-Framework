package framework.tests;

import aquality.selenium.browser.AqualityServices;
import framework.pages.BasicAuthPage;
import framework.pages.MainPageNavigation;
import framework.utils.SettingsTestData;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class BasicAuthTest extends BaseTest {
    private BasicAuthPage basicAuthPage = new BasicAuthPage();

    @BeforeMethod
    public void auth() {
//        browser.network().addBasicAuthentication(
//                "",
//                SettingsTestData.getUserData().getUsername(),
//                SettingsTestData.getUserData().getPassword());
        AqualityServices.getBrowser().network().addBasicAuthentication(
                "",
                SettingsTestData.getUserData().getUsername(),
                SettingsTestData.getUserData().getPassword());

        AqualityServices.getBrowser().setImplicitWaitTimeout(Duration.ofSeconds(15));
    }

    @Test
    public void basicAuthTest() {
        mainPage.clickNavigationLink(MainPageNavigation.BASIC_AUTH);
        AqualityServices.getBrowser().setImplicitWaitTimeout(Duration.ofSeconds(15));
        Assert.assertTrue(basicAuthPage.isSuccessMsgDisplayed(),"message was not displayed");
    }
}
