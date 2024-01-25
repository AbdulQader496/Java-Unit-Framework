package framework.pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.ElementFactory;
import aquality.selenium.elements.interfaces.IElementFactory;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.elements.interfaces.ILink;
import aquality.selenium.forms.Form;
import framework.LocatorConstants;
import org.openqa.selenium.By;

public class JQueryUiMenuesPage extends Form {

    private static final String NAME = "JQueryUI - Menus";
    private IElementFactory elementFactory = AqualityServices.getElementFactory();
    private final By ENABLE_LOCATOR = By.xpath("//*[contains(text(),'Enabled')]");
    private ILabel ENABLE_LABLE = elementFactory.getLabel(ENABLE_LOCATOR, "enable lable");
    private final By DOWNLOAD_LOCATOR = By.xpath("//*[contains(text(),'Downloads')]");
    private ILabel DOWNLOAD_LABLE = elementFactory.getLabel(DOWNLOAD_LOCATOR, "download lable");
    private final By PDF_LOCATOR = By.xpath("//*[contains(text(),'PDF')]");
    private ILabel PDF_DOWNLOAD_LABLE = elementFactory.getLabel(PDF_LOCATOR,"pdf download lable");

    public JQueryUiMenuesPage() {
        super(By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH, NAME)), NAME);
    }

    public void clickEnableLable() {
        ENABLE_LABLE.clickAndWait();
    }
    public void clickDownloadLable() {
        DOWNLOAD_LABLE.clickAndWait();
    }
    public void clickPdfDownloadLable() {
        PDF_DOWNLOAD_LABLE.clickAndWait();
    }





}
