package testCases;

import base.Messages;
import jdk.jfr.Description;
import pages.HeaderPage;
import testCases.baseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import pages.ProductsPage;
import pages.LandingPage;

import java.util.ArrayList;
import java.util.List;

public class LoginTest extends BaseTest {
    LandingPage loginPage;
    ProductsPage productsPage;
    HeaderPage headerPage;
    @BeforeSuite
    void setup(){
        loginPage = new LandingPage(getDriver());
        headerPage = new HeaderPage(getDriver());
    }
    @Test(priority = 1)
    @Description("Test case to verify that user lands on Home page")
    void verifyLogin() throws InterruptedException {
        // This is just data I am using to assert my test case
        List<String> list = new ArrayList<>();
        list.add("HOME");
        list.add("ORDERS");
        list.add("Cart");
        list.add("Sign Out");
        //===============================================
        productsPage = loginPage.loginApplication("qa12@gmail.com","Admin@123");
        Assert.assertEquals(headerPage.getAllOptions(),list);
    }
    @Test(priority = 0,enabled = false)
    @Description("Test case to verify error message when user enters wrong details")
    void verifyErrorMessage() throws InterruptedException {
        Assert.assertEquals(loginPage.loginInvalidCred("test","test"), Messages.Incorrect_email_or_password);
    }
    @AfterSuite
    void tearDown(){
        getDriver().quit();
    }
}
