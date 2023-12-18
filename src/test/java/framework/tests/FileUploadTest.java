package framework.tests;

import framework.pages.FileUploadPage;
import framework.pages.MainPageNavigation;
import framework.pages.UploadedFilePage;
import framework.utils.SettingsTestData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;


public class FileUploadTest extends BaseTest {
    private FileUploadPage fileUploadPage = new FileUploadPage();
    private UploadedFilePage uploadedFilePage = new UploadedFilePage();
    public final String FILE_NAME = SettingsTestData.getFileData().getUploadFile();
    public final String FILE_PATH = SettingsTestData.RESOURCE_FILE_PATH + FILE_NAME;

    @Test
    public void fileUploadTest() {
        mainPage.clickNavigationLink(MainPageNavigation.FILE_UPLOAD);
        fileUploadPage.uploadFile(new File(FILE_PATH).getAbsolutePath());
        fileUploadPage.clickSubmitBtn();
        Assert.assertEquals(uploadedFilePage.getUploaadedFileName(), FILE_NAME, "File name is not correct or not uploaded");
    }
}
