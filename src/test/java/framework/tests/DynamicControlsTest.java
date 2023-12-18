package framework.tests;

import framework.pages.DynamicControlsPage;
import framework.pages.MainPageNavigation;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.UUID;

public class DynamicControlsTest extends BaseTest {
    private DynamicControlsPage dynamicControlsPage = new DynamicControlsPage();
    private final String RANDOM_TEXT = UUID.randomUUID().toString();

    @Test
    public void dynamicControlsTest() {
        mainPage.clickNavigationLink(MainPageNavigation.DYNAMIC_CONTROLS);
        dynamicControlsPage.clickElement();
        Assert.assertTrue(dynamicControlsPage.isInputEnabled(), "Input is enabled");
        dynamicControlsPage.inputText(RANDOM_TEXT);
        Assert.assertEquals(dynamicControlsPage.getInputTextValue(), RANDOM_TEXT, "Test is not same");
    }


}
