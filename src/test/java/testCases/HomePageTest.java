package testCases;

import testCases.baseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.HomePage;

public class HomePageTest extends BaseTest {
    HomePage homePage;
    CartPage cartPage;
    @BeforeTest
    void setup(){
        homePage = new HomePage(getDriver());
        cartPage = new CartPage(getDriver());
    }
    @Test
    void homeTest() throws InterruptedException {
        String productName ="ZARA COAT 3";
        homePage.selectSpecificProduct(productName);
        Thread.sleep(6000);
        homePage.moveToCart();
        String str = cartPage.getTheSelectedItem(productName);
        Assert.assertEquals(str,productName);
        cartPage.clickCheckout();
    }
}
