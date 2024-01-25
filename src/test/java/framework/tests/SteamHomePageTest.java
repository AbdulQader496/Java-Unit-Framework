package framework.tests;

import framework.pages.InstallPage;
import framework.pages.SteamHomePage;
import framework.utils.FileUtil;
import framework.utils.SettingsTestData;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.io.File;

public class SteamHomePageTest extends BaseTest {


    private SteamHomePage steamHomePage = new SteamHomePage();
    private InstallPage installPage = new InstallPage();
    public final String FILE_NAME = SettingsTestData.getFileData().getDownloadFile();
    public final String FILE_PATH = SettingsTestData.RESOURCE_FILE_PATH + FILE_NAME;
    private final File downloadedFile = new File(FILE_PATH);

    @Test
    public void steamHomePageTest() {

        steamHomePage.clickDownload();
        installPage.clickInstallSteam();
        Assert.assertTrue(FileUtil.isFileExist(downloadedFile), "File is not downloaded");
    }

    @AfterMethod
    public void deleteFile() {
        FileUtil.deleteFileIfExist(downloadedFile);
    }

}
