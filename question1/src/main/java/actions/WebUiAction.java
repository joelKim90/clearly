package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class WebUiAction extends BaseAction {
    public WebUiAction(WebDriver driver) {
        super(driver);
    }

    public void click(String xpath) {
        driver.findElement(By.xpath(xpath)).click();
    }

    public boolean checkIsElementVisible(String xpath) {
        return driver.findElement(By.xpath(xpath)).isDisplayed();
    }

    public void waitForTime() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void inputText(String xpath, String text) {
        driver.findElement(By.xpath(xpath)).sendKeys(text);
    }

    public void pressEnter() {
        driver.switchTo().activeElement().sendKeys(Keys.ENTER);
    }

    public String getText(String xpath) {
        return driver.findElement(By.xpath(xpath)).getText();
    }
}
