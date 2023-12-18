package framework.tests;

import framework.pages.DataTablesPage;
import framework.pages.MainPageNavigation;
import framework.utils.SettingsTestData;
import framework.utils.StringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DataTableTests extends BaseTest {
    private DataTablesPage dataTablesPage = new DataTablesPage();




    @Test
    public void dataFirstTableTest() {
        mainPage.clickNavigationLink(MainPageNavigation.SORTABLE_DATA_TABLES);
        Double actualSum = 0.0;
        for (String due: dataTablesPage.getFirstDueList()) {
            actualSum += StringUtils.getDoubleFromString(due);
        }
        Assert.assertEquals(actualSum, SettingsTestData.getDataTableData().getExpectedDueSum(), "Sum is not correct");
    }

    @Test
    public void dataSecondTableTest() {
        mainPage.clickNavigationLink(MainPageNavigation.SORTABLE_DATA_TABLES);
        Double actualSum = 0.0;
        for (String due: dataTablesPage.getSecondDueList()) {
            actualSum += StringUtils.getDoubleFromString(due);
        }
        Assert.assertEquals(actualSum, SettingsTestData.getDataTableData().getExpectedDueSum(), "Sum of 2nd table is not correct");
    }
}
