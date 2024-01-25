package framework.tests;

import framework.pages.MainPageNavigation;
import framework.pages.NotificationMessagePage;
import org.testng.annotations.Test;

public class NotificationMessageTest extends BaseTest{
    private NotificationMessagePage notificationMessagePage = new NotificationMessagePage();

    @Test
    public void notificationMsgTest() {
        mainPage.clickNavigationLink(MainPageNavigation.NOTIFICATION_MESSAGES);
        notificationMessagePage.clickHereLink();
        notificationMessagePage.isUnsuccessfulMsgDisplayed();
    }
}
