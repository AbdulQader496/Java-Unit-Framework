package framework.tests;

import framework.pages.HorizontalSliderPage;
import framework.pages.MainPageNavigation;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HorizontalSliderTest extends BaseTest{
    private HorizontalSliderPage horizontalSliderPage = new HorizontalSliderPage();

    @Test
    public void horizontalSliderTest() {
        mainPage.clickNavigationLink(MainPageNavigation.HORIZONTAL_SLIDER);

//        horizontalSliderPage.clickSlider();

        Actions action = new Actions(browser.getDriver());
        action.dragAndDropBy(horizontalSliderPage.clickSlider().getElement(), 140,171).perform();
    }
}
