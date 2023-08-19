package pages.designPatternsExplain.pageComonents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.designPatternsExplain.abstractComponent.AbstractComponent;
import pages.designPatternsExplain.abstractComponent.SearchFlights;

public class RoundTrip extends AbstractComponent implements SearchFlights {
    By roundTripRadio = By.id("ctl00_mainContent_rbtnl_Trip_1");
    By from = By.id("ctl00_mainContent_ddl_originStation1_CTXT");
    By to = By.id("ctl00_mainContent_ddl_destinationStation1_CTXT");
    By armyCheckBox = By.id("ctl00_mainContent_chk_IndArm");

    public RoundTrip(By by, WebDriver driver) {
        super(by, driver);
    }

    @Override
    public void availabilityOfFlights(String origin, String destination) {
       // findElement(roundTripRadio).click();
        SelectOriginCity(origin);
        SelectDestinationCity(destination);
        findElement(armyCheckBox).click();
    }
    public void SelectOriginCity(String city_origin){
       /* try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        findElement(from).click();
        findElement(By.xpath("//a[@value='"+city_origin+"']")).click();
    }
    public void SelectDestinationCity(String city_destination){
        findElement(to).click();
        findElement(By.xpath("(//a[@value='"+city_destination+"'])[2]")).click();
    }
}
