package testCases;

import base.Messages;
import jdk.jfr.Description;
import pages.CheckOutPage;
import testCases.baseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.ProductsPage;
import testData.ShoppingCartTestData;

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
    @Test(dataProvider = "shoppingData",dataProviderClass = ShoppingCartTestData.class)
    @Description("Test case to verify that user should get an error popup once all the fields are blanks")
    void verifyShoppingCartTest(String productName) throws InterruptedException {
        productsPage.selectSpecificProduct(productName);
        productsPage.moveToCart();
        Assert.assertEquals(cartPage.getTheSelectedItem(productName),"ZARA COAT 3");
        cartPage.clickCheckout();
        Assert.assertEquals(checkOutPage.placeOrderBtn(), Messages.please_Enter_Full_Shipping_Information);
    }
}
