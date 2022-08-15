package TestScripts;

import Pages.HomePage;
import amazon.config.EnvFactory;
import amazon.factories.DriverFactory;
import com.typesafe.config.Config;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public class BaseTest {

    private static Config config = EnvFactory.getInstance().getConfig();
    private static final String HOME_PAGE_URL = config.getString("HOME_PAGE_URL");
    private static WebDriver driver = DriverFactory.getDriver();

    @BeforeEach
    public void launchApp(){
        driver.get(HOME_PAGE_URL);
    }

    public WebDriver getDriver(){
        return driver;
    }

    @AfterEach
    public void quitBrowser(){
        driver.quit();
    }

}
