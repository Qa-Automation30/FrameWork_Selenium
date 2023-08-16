package testCases;

import base.Global;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends Global {
    LoginPage loginPage;
    @BeforeTest
    void setup(){
        loginPage = new LoginPage(getDriver());
    }
    @Test
    void firstTestCase(){
        loginPage.loginApplication("qa12@gmail.com","Admin@123");
        Assert.assertTrue(true);
    }
}
