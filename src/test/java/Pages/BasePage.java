package Pages;

import TestScripts.BaseTest;
import amazon.config.EnvFactory;
import amazon.factories.DriverFactory;
import com.typesafe.config.Config;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class BasePage extends BaseTest  {

    private String oldWindow=null;

    public BasePage() {
        PageFactory.initElements(getDriver(), this);
         oldWindow = getCurrentWindows();
    }


    public WebDriverWait appWait(){

        return   new WebDriverWait(getDriver(), Duration.ofSeconds(20));
    }


    /**
    * Dynamic Locator
    * return webElement
    * */
    public WebElement getDynamicElement(String value, String locator){
        WebElement element= null;
        switch (locator) {
            case "Link":
                 element = getDriver().findElement(new By.ByLinkText(value));
                break;
        }
    return element;
    }


    public String getCurrentWindows(){
        return oldWindow;
    }


    /**
     * Switch to new Window
     * return void
     * */
    public void switchToNewWindow(){
        Set<String> newWindow = getDriver().getWindowHandles();
        for(String  win : newWindow){
            if(win!=getCurrentWindows()) {
                getDriver().switchTo().window(win);
            }
        }

    }

}
