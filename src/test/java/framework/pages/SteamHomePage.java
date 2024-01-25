package framework.pages;
import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.IElementFactory;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import framework.LocatorConstants;
import org.openqa.selenium.By;

public class SteamHomePage extends Form{
    private IElementFactory elementFactory = AqualityServices.getElementFactory();
    private static final String NAME = "Steam";

    private By STEAM_INSTALL_LOCATIOR = By.xpath("//*[contains(text(),'Install Steam')]");
    private ILabel STEAM_INSTALL__LABLE = elementFactory.getLabel(STEAM_INSTALL_LOCATIOR, "click to download steam");

    public SteamHomePage() {
        super(By.xpath(String.format(LocatorConstants.PARTICULAR_TEXT_XPATH, NAME)), NAME);
    }

    public void clickDownload() {
        STEAM_INSTALL__LABLE.click();
    }




}
