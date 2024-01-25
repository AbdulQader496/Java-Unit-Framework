package framework.pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.CheckBox;
import aquality.selenium.elements.interfaces.ICheckBox;
import aquality.selenium.elements.interfaces.IElementFactory;
import aquality.selenium.forms.Form;
import framework.LocatorConstants;
import org.openqa.selenium.By;


public class CheckBoxPage extends Form {
    private IElementFactory elementFactory = AqualityServices.getElementFactory();
    private static final String NAME = "Checkboxes";
    private static final By CHECKBOX1_LOCATOR = By.xpath("//*[@id='checkboxes']/input[1]");
    private static final By CHECKBOX2_LOCATOR = By.xpath("//*[@id='checkboxes']/input[2]");
    private ICheckBox CheckBox1 = elementFactory.getCheckBox(CHECKBOX1_LOCATOR, "checkbox");
    private ICheckBox CheckBox2 = elementFactory.getCheckBox(CHECKBOX2_LOCATOR, "checkbox");

    public CheckBoxPage() {
        super(By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH, NAME)), NAME);
    }

    public void clickCheckbox1() {
        CheckBox1.check();
    }
    public void clickCheckbox2() {
        CheckBox2.check();
    }





}
