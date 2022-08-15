package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage{


    @FindBy(css = "#feature-bullets ul")
    WebElement aboutItemDetails;

    @FindBy(css = ".a-size-base-plus.a-text-bold")
    WebElement aboutItemHeader;


    public String  aboutItemHeader(){
        return  aboutItemHeader.getText().trim();

    }

    public String  getAboutItemsSection(){
        return  aboutItemDetails.getText();

    }



}
