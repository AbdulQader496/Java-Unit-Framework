package framework.pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.IElementFactory;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.elements.interfaces.ILink;
import aquality.selenium.forms.Form;
import framework.LocatorConstants;
import org.openqa.selenium.By;
import org.testng.Assert;

public class NotificationMessagePage extends Form {
    private IElementFactory elementFactory = AqualityServices.getElementFactory();

    private static final String NAME = "Notification Message";
    private static final By NOTIFICATION_LOCATOR = By.xpath(String.format(LocatorConstants.PARTICULAR_TEXT_XPATH, "Action unsuccesful, please try again"));
    private final ILabel unsuccessfull_message = getElementFactory().getLabel(NOTIFICATION_LOCATOR, "unsuccessful message displayed");
    private static final By CLICK_HERE_LOCATOR = By.xpath(String.format(LocatorConstants.PARTICULAR_TEXT_XPATH, "Click here"));
    private final ILink ClickHereLink = getElementFactory().getLink(CLICK_HERE_LOCATOR, "click here link");


    public NotificationMessagePage() {
        super(By.xpath(String.format(LocatorConstants.PARTICULAR_TEXT_XPATH, NAME)), NAME);
    }

    public void clickHereLink() {
        ClickHereLink.click();
    }
    public void isUnsuccessfulMsgDisplayed() {
        unsuccessfull_message.state().waitForDisplayed();
    }

}
