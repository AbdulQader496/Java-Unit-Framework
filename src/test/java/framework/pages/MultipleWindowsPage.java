package framework.pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.IElement;
import aquality.selenium.elements.interfaces.IElementFactory;
import aquality.selenium.elements.interfaces.ILink;
import aquality.selenium.forms.Form;
import framework.LocatorConstants;
import org.openqa.selenium.By;

public class MultipleWindowsPage extends Form {
    private static final String NAME = "Opening a new window";
    private IElementFactory elementFactory = AqualityServices.getElementFactory();
    private final By NEW_WINDOW_LINK_LOCATOR = By.xpath(String.format(LocatorConstants.PARTICULAR_TEXT_XPATH, "Click Here"));

    private final ILink NEW_WINDOW_LINK = elementFactory.getLink(NEW_WINDOW_LINK_LOCATOR, "link to new window");


    public MultipleWindowsPage() {
        super(By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH, NAME)), NAME);
    }

    public void clickNewWindowsLink() {
        NEW_WINDOW_LINK.click();
    }

}
