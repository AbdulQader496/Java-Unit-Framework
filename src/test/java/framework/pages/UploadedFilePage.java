package framework.pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import framework.LocatorConstants;
import org.openqa.selenium.By;

public class UploadedFilePage extends Form {
    private static final String NAME = "File Uploaded!";
    private final By UPLOADED_FILE = By.id("uploaded-files");
    private ILabel uploadedFileLbl = AqualityServices.getElementFactory().getLabel(UPLOADED_FILE, "File name");
    public UploadedFilePage() {
        super(By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH, NAME)), NAME);
    }

    public String getUploaadedFileName() {
        return uploadedFileLbl.getText();
    }
}
