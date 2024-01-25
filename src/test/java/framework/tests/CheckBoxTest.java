package framework.tests;

import framework.pages.CheckBoxPage;
import framework.pages.MainPageNavigation;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class CheckBoxTest extends BaseTest {

    private CheckBoxPage checkBoxPage = new CheckBoxPage();
    @Test
    public void checkjboxTest() {
        mainPage.clickNavigationLink(MainPageNavigation.CHECKBOXES);
        checkBoxPage.clickCheckbox2();
        browser.setImplicitWaitTimeout(Duration.ofSeconds(60));
        checkBoxPage.clickCheckbox1();



    }
}
