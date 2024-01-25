package framework.tests;

import framework.pages.JQueryUiMenuesPage;
import framework.pages.JavaScriptAlertsPage;
import framework.pages.MainPageNavigation;
import framework.utils.FileUtil;
import framework.utils.SettingsTestData;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.io.File;

public class JQueryUiMenusTest extends BaseTest{
    private JQueryUiMenuesPage jQueryUiMenuesPage = new JQueryUiMenuesPage();
    public final String FILE_NAME = SettingsTestData.getFileData().getJQueryDownloadFile();
    public final String FILE_PATH = SettingsTestData.RESOURCE_FILE_PATH + FILE_NAME;
    private final File JQueryDownloadedFile = new File(FILE_PATH);

    @Test
    public void JQueryUiMenusTest() {
        mainPage.clickNavigationLink(MainPageNavigation.JQueryUiMenus);
        jQueryUiMenuesPage.clickEnableLable();
        jQueryUiMenuesPage.clickDownloadLable();
        jQueryUiMenuesPage.clickPdfDownloadLable();
        Assert.assertTrue(FileUtil.isFileExist(JQueryDownloadedFile), "File is not downloaded");
    }

    @AfterMethod
    public void deleteFile() {
        FileUtil.deleteFileIfExist(JQueryDownloadedFile);
    }
}
