package testCases;

import base.Global;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends Global {
    LoginPage loginPage;
    HomePage homePage;
    @BeforeSuite
    void setup(){
        loginPage = new LoginPage(getDriver());
    }
    @Test
    void firstTestCase(){
        homePage = loginPage.loginApplication("qa12@gmail.com","Admin@123");
        Assert.assertTrue(true);
    }
    @AfterSuite
    void tearDown(){
        getDriver().quit();
    }
}
