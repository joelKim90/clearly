import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    public WebDriver driver;

    @BeforeClass
    public void setup() {
        String path = System.getProperty("user.dir");
        path+="/src/main/resources/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", path);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        this.driver = new ChromeDriver(options);
        this.driver.manage().window().maximize();
    }


    @AfterClass
    public void close() {
        driver.quit();
    }
}
