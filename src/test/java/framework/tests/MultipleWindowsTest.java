package framework.tests;

import framework.pages.MainPageNavigation;
import framework.pages.MultipleWindowsPage;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class MultipleWindowsTest extends BaseTest{
    private MultipleWindowsPage multipleWindowsPage = new MultipleWindowsPage();
    @Test
    public void multipleWindowsPage() {
        mainPage.clickNavigationLink(MainPageNavigation.MULTIPLEWINDOWS);
        multipleWindowsPage.clickNewWindowsLink();
        String originalWindow = browser.getDriver().getWindowHandle();
        Set<String>s=browser.getDriver().getWindowHandles();
        Iterator<String> I1= s.iterator();

        while (I1.hasNext())
        {
            String child_window=I1.next();
            if(!originalWindow.equals(child_window))
            {
                browser.getDriver().switchTo().window(child_window);
                System.out.println(browser.getDriver().switchTo().window(child_window).getTitle());

                browser.getDriver().close();
            }
        }
        browser.getDriver().switchTo().window(originalWindow);




    }
}
