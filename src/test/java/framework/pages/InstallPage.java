package framework.pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.IElementFactory;
import aquality.selenium.elements.interfaces.ILink;
import aquality.selenium.forms.Form;
import framework.LocatorConstants;
import org.openqa.selenium.By;

public class InstallPage extends Form {

    private IElementFactory elementFactory = AqualityServices.getElementFactory();

    private final By INSTALL_LINK_LOCATOR = By.xpath("//*[@id='about_greeting']/div[2]/div[1]/a");
    private ILink INSTALL_LINK = elementFactory.getLink(INSTALL_LINK_LOCATOR, "link to download");
    private static final String NAME = "Steam";

    public InstallPage() {
        super(By.xpath(String.format(LocatorConstants.PARTICULAR_TEXT_XPATH, NAME)), NAME);
    }

    public void clickInstallSteam() {
        INSTALL_LINK.click();
    }


}
