package pages.designPatternsExplain.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.designPatternsExplain.MainPage.TravelHomePage;
import pages.designPatternsExplain.pageComonents.MultiCity;
import pages.designPatternsExplain.pageComonents.RoundTrip;

public class DemoTest {
    // Section Element
    By sectionElement = By.id("flightSearchContainer");
    @Test
    void flightTest() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        TravelHomePage travelHomePage = new TravelHomePage(driver);
        travelHomePage.goToTravelPage();
        /**
         * This shows the concept of SRP (Single responsibility principle)
         */
        travelHomePage.getFooterNavigation().selectOption();
        travelHomePage.getHeaderNavigation().getSelectedItemName();
        /**
         * This shows the concept of Strategy Design pattern
         */
       // travelHomePage.setFlightBookingStrategy(new RoundTrip(sectionElement,driver),"HYD","MAA");
        travelHomePage.setFlightBookingStrategy(new MultiCity(sectionElement,driver),"HYD","MAA");

    }
}
