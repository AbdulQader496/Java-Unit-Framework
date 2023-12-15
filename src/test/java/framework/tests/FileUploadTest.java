package framework.tests;

import framework.pages.MainPageNavigation;
import framework.utils.SettingsTestData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;


public class FileUploadTest extends BaseTest {
    public final String FILE_NAME = SettingsTestData.getFileData().getUploadFile();
    public final String FILE_PATH = SettingsTestData.RESOURCE_FILE_PATH + FILE_NAME;


    @Test
    public void fileUploadTest() {
        // todo: add test
    }
}
