package testCases;

import base.Messages;
import jdk.jfr.Description;
import pages.HeaderPage;
import pages.PlaceOrderPage;
import testCases.baseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.ProductsPage;
import testData.ShoppingCartTestData;

import javax.swing.plaf.TableHeaderUI;

public class ShoppingCartTest extends BaseTest {
    ProductsPage productsPage;
    CartPage cartPage;
    PlaceOrderPage placeOrderPage;
    HeaderPage headerPage;

    @BeforeTest
    void setup(){
        productsPage = new ProductsPage(getDriver());
        headerPage = new HeaderPage(getDriver());
    }
    @Test(dataProvider = "shoppingData",dataProviderClass = ShoppingCartTestData.class,priority = 2)
    @Description("Test case to verify that user should get an error popup once all the fields are blanks")
    void verifyShoppingCartTest(String productName) throws InterruptedException {
        headerPage.moveToPages("Home");
        productsPage.selectSpecificProduct(productName);
        cartPage = productsPage.goToCart();
        Assert.assertEquals(cartPage.getTheSelectedItem(productName),"ZARA COAT 3");
        placeOrderPage = cartPage.goToCheckOut();
        Assert.assertEquals(placeOrderPage.placeOrderBtn(), Messages.please_Enter_Full_Shipping_Information);
    }
    @Test(dataProvider = "shoppingData",dataProviderClass = ShoppingCartTestData.class,priority = 1)
    @Description("Test case to verify that user should be able to place the order")
    void verifyUserCanPlaceOrder(String productName) throws InterruptedException {
        productsPage.selectSpecificProduct(productName);
        cartPage = productsPage.goToCart();
        Assert.assertEquals(cartPage.getTheSelectedItem(productName),"ZARA COAT 3");
        placeOrderPage = cartPage.goToCheckOut();
        placeOrderPage.selectCountry("india");
        Assert.assertEquals(placeOrderPage.placeOrderBtn(), Messages.Order_Placed_Successfully);
    }

}
