package framework.pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.IElementFactory;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import framework.LocatorConstants;
import org.openqa.selenium.By;


public class HorizontalSliderPage extends Form {
    private IElementFactory elementFactory = AqualityServices.getElementFactory();
    private static final String NAME = "Horizontal Slider";
    private final By RANGE_SLIDER_LOCATOR = By.xpath("//*[@type='range']");
    private ILabel RANGE_SLIDER_LABLE = elementFactory.getLabel(RANGE_SLIDER_LOCATOR, "slide range");



    public HorizontalSliderPage() {
        super(By.xpath(String.format(LocatorConstants.PARTICULAR_TEXT_XPATH, NAME)), NAME);
    }

    public ILabel clickSlider() {
        return (ILabel) RANGE_SLIDER_LABLE;
    }

}
