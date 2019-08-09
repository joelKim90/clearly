package pages;

import actions.WebUiAction;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
        driver.get("https://clearly.ca/glasses/womens");
    }

    WebUiAction webUiAction = new WebUiAction(driver);

    public void closePopUpIfVisible() {
        if(webUiAction.checkIsElementVisible("//div[@id='newsletterSignUpPopup']")) {
            webUiAction.click("//div[@id='newsletterSignUpPopup']//button[@class='close']");
            webUiAction.waitForTime();
        }
    }

    public SearchPage searchForProduct(String productName) {
        webUiAction.click("//a[@data-clyauto-id='search-trigger-desktop']");
        webUiAction.inputText("//input[@type='search']", productName);
        webUiAction.pressEnter();
        webUiAction.waitForTime();
        return new SearchPage(driver);
    }
}
