import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SearchPage;

public class TestSearch extends BaseTest {
    @Test(dataProvider = "getProductName")
    public void testSearchFunctionality(String productName) {
        HomePage homePage = new HomePage(driver);
        homePage.closePopUpIfVisible();
        SearchPage searchPage = homePage.searchForProduct(productName);
        Assert.assertTrue(searchPage.verifyResultSearchString(productName));
        Assert.assertTrue(searchPage.verifyResultsRendered());
    }

    @DataProvider
    public Object[] getProductName() {
        return new Object[] {"Derek Cardigan", "Kam Dhilon", "Main and Central"};
    }
}
