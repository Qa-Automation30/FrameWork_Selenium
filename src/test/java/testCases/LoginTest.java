package testCases;

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
    void firstTestCase() throws InterruptedException {
        List<String> str = new ArrayList<>();
        str.add("Home");
        str.add("ORDERS");
        str.add("Cart");
        str.add("Sign Out");
        //===============================================
        homePage = loginPage.loginApplication("qa12@gmail.com","Admin@123");
        Thread.sleep(3000);
        System.out.println(homePage.getAllOptions());
        Thread.sleep(3000);
        Assert.assertEquals(homePage.getAllOptions(),str);
    }
    @AfterSuite
    void tearDown(){
        getDriver().quit();
    }
}
