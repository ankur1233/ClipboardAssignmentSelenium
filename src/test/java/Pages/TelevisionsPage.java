package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.List;


public class TelevisionsPage extends BasePage{

    @FindBy(xpath = "//*[@data-action='a-dropdown-button']/span[text()='Featured']")
    WebElement feature;

    @FindBy(className = "a-price-whole")
    List<WebElement> price;

    public TelevisionsPage clickOnPrice(int c){
        System.out.println(price.size());
        int count=1;
        for(WebElement cost : price){
            count++;
            if (count==c){
                cost.click();
            }
        }

        return this;

    }

    public void clickOnFeatureLink(){
        appWait().until(ExpectedConditions.elementToBeClickable(feature));
        feature.click();

    }

    public TelevisionsPage selectFeature(String value){
        clickOnFeatureLink();
        getDynamicElement(value,"Link").click();
        return this;
    }


    public TelevisionsPage clickOnBrand(String brand){
        getDynamicElement(brand,"Link").click();
        return this;

    }



}
