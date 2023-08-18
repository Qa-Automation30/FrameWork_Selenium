package testCases;

import jdk.jfr.Description;
import pages.CheckOutPage;
import testCases.baseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.ProductsPage;

public class ShoppingCartTest extends BaseTest {
    ProductsPage productsPage;
    CartPage cartPage;
    CheckOutPage checkOutPage;
    @BeforeTest
    void setup(){
        productsPage = new ProductsPage(getDriver());
        cartPage = new CartPage(getDriver());
        checkOutPage = new CheckOutPage(getDriver());
    }
    @Test
    @Description("Test case to verify that user should get an error popup once all the fields are blanks")
    void verifyShoppingCartTest() throws InterruptedException {
        productsPage.selectSpecificProduct("ZARA COAT 3");
        productsPage.moveToCart();
        Assert.assertEquals(cartPage.getTheSelectedItem("ZARA COAT 3"),"ZARA COAT 3");
        cartPage.clickCheckout();
        Assert.assertEquals(checkOutPage.placeOrderBtn(),"Please Enter Full Shipping Information");
    }
}
