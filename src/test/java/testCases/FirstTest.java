package testCases;

import base.Global;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.LoginPage;

public class FirstTest extends Global {
    WebDriver driver;
    LoginPage loginPage;
    @BeforeTest
    void setup(){
        driver = getDriver();
        loginPage = new LoginPage(driver);
    }
    @Test
    void firstTestCase(){
        String s = loginPage.loginApplication("qa12@gmail.com","Admin@123");
        System.out.println(s);
    }
    @AfterTest
    void close(){
        driver.close();
    }
}
