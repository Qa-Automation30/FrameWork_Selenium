package testCases;

import jdk.jfr.Description;
import pages.CheckOutPage;
import testCases.baseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.HomePage;

public class ShoppingCartTest extends BaseTest {
    HomePage homePage;
    CartPage cartPage;
    CheckOutPage checkOutPage;
    @BeforeTest
    void setup(){
        homePage = new HomePage(getDriver());
        cartPage = new CartPage(getDriver());
        checkOutPage = new CheckOutPage(getDriver());
    }
    @Test
    @Description("Test case to verify that user should get an error popup once all the fields are blanks")
    void verifyShoppingCartTest() throws InterruptedException {
        homePage.selectSpecificProduct("ZARA COAT 3");
        homePage.moveToCart();
        Assert.assertEquals(cartPage.getTheSelectedItem("ZARA COAT 3"),"ZARA COAT 3");
        cartPage.clickCheckout();
        Assert.assertEquals(checkOutPage.placeOrderBtn(),"Please Enter Full Shipping Information");
    }
}
