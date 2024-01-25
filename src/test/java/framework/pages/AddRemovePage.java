package framework.pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.forms.Form;
import framework.LocatorConstants;
import org.openqa.selenium.By;

public class AddRemovePage extends Form {
     private static final String NAME = "Add/Remove Elements";
     private IButton addElementBtn = AqualityServices.getElementFactory().getButton(By.xpath("//button[@onClick='addElement()']"), "Add button element");
     private IButton deleteElementBtn = AqualityServices.getElementFactory().getButton(By.xpath("//button[@onClick='deleteElement()']"), "Delete button element");
     public AddRemovePage() {
          super(By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH, NAME)), NAME);
     }

     public void clickAddElementBtn() {
          addElementBtn.click();
     }

     public void clickDeleteElementBtn() {
          deleteElementBtn.click();
     }

     public boolean isDeleteElementBtnDisplayed() {
          return deleteElementBtn.state().isDisplayed();
     }

     public boolean isDeleteElementBtnExists() {
          return deleteElementBtn.state().isExist();
     }

}
