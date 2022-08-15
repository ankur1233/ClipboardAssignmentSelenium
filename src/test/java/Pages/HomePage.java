package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage {

    @FindBy(id="nav-hamburger-menu")
    WebElement hamburgerMenu;

    @FindBy(partialLinkText="TV, Appliances, Electronics")
    WebElement subDepartmentLink;

    @FindBy(partialLinkText="Televisions")
    WebElement Televisions;


    public HomePage clickOnHamburgerMenu(){
        appWait().until(ExpectedConditions.visibilityOf(hamburgerMenu));
        hamburgerMenu.click();
        return this;
    }
    public HomePage clickOnSubDepartmentLink(){
        appWait().until(ExpectedConditions.visibilityOf(subDepartmentLink));
        subDepartmentLink.click();
        return this;
    }

    public HomePage clickOnTelevisionsLink(){
        appWait().until(ExpectedConditions.visibilityOf(Televisions));
        Televisions.click();
        return this;
    }




}
