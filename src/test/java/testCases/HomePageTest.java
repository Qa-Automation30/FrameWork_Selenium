package testCases;

import base.Global;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomePageTest extends Global {
    HomePage homePage;
    @BeforeTest
    void setup(){
        homePage = new HomePage(getDriver());
    }
    @Test
    void homeTest() throws InterruptedException {
        homePage.selectSpecificProduct("ZARA COAT 3");
        Thread.sleep(6000);
    }
}
