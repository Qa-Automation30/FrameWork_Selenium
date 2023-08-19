package pages.designPatternsExplain.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.designPatternsExplain.MainPage.TravelHomePage;

public class DemoTest {

    @Test
    void flightTest() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        TravelHomePage travelHomePage = new TravelHomePage(driver);
        travelHomePage.goToTravelPage();
        travelHomePage.getFooterNavigation().selectOption();
    }
}