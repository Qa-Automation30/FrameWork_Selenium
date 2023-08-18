package testCases;

import jdk.jfr.Description;
import testCases.baseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

import java.util.ArrayList;
import java.util.List;

public class LoginTest extends BaseTest {
    LoginPage loginPage;
    HomePage homePage;
    @BeforeSuite
    void setup(){
        loginPage = new LoginPage(getDriver());
    }
    @Test
    @Description("Test case to verify that user lands on Home page")
    void firstTestCase() throws InterruptedException {
        List<String> list = new ArrayList<>();
        list.add("HOME");
        list.add("ORDERS");
        list.add("Cart");
        list.add("Sign Out");
        //===============================================
        homePage = loginPage.loginApplication("qa12@gmail.com","Admin@123");
        Assert.assertEquals(homePage.getAllOptions(),list);
    }
    @AfterSuite
    void tearDown(){
        getDriver().quit();
    }
}
