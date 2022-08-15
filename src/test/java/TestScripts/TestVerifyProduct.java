package TestScripts;

import Pages.BasePage;
import Pages.HomePage;
import Pages.ProductPage;
import Pages.TelevisionsPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class TestVerifyProduct extends BaseTest {


    @Tag("smokeTest")
    @DisplayName("This test is to verify product television on amazon.in application with about items details section")
    @Test
    public void verifyProduct(){

        new HomePage().
                clickOnHamburgerMenu().
                    clickOnSubDepartmentLink().
                        clickOnTelevisionsLink();


        new TelevisionsPage().clickOnBrand("Samsung").
                                    selectFeature("Price: High to Low").clickOnPrice(2).
                                switchToNewWindow();


        // Assertion verify product page is present
        Assertions.assertEquals(new ProductPage().aboutItemHeader(),"About this item");

        // Console product about items details
       System.out.println("Product Details "+new ProductPage().getAboutItemsSection());
    }
}
