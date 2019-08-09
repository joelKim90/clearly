package pages;

import actions.WebUiAction;
import org.openqa.selenium.WebDriver;

public class SearchPage extends BasePage {
    public SearchPage(WebDriver driver) {
        super(driver);
    }

    WebUiAction webUiAction = new WebUiAction(driver);

    public boolean verifyResultSearchString(String productName) {
        return webUiAction.getText("//h1").contains(productName);
    }

    public boolean verifyResultsRendered() {
        return webUiAction.checkIsElementVisible("//div[@class='container js-grid-search-wrapper pos-r']");
    }
}
