package pages.designPatternsExplain.pageComonents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.designPatternsExplain.abstractComponent.AbstractComponent;
import pages.designPatternsExplain.abstractComponent.SearchFlights;

public class MultiCity extends AbstractComponent implements SearchFlights {
    private By from = By.id("ctl00_mainContent_ddl_originStation1_CTXT");
    private By to = By.id("ctl00_mainContent_ddl_destinationStation1_CTXT");
    private By submit = By.id("ctl00_mainContent_btn_FindFlights");
    private By multiCity_rdo = By.id("ctl00_mainContent_rbtnl_Trip_2");
    private By destination_2= By.id("ctl00_mainContent_ddl_originStation2_CTXT");
    private By modalPopUp = By.id("MultiCityModelAlert");

    public MultiCity(By by, WebDriver driver) {
        super(by, driver);
    }


    @Override
    public void availabilityOfFlights(String origin, String destination) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        findElement(multiCity_rdo).click();
        findElement(modalPopUp).click();
        selectOriginCity(origin);
        selectDestinationCity(destination);
        selectDestinationCity2("BLR");

    }
    public void selectOriginCity(String city_origin){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        findElement(from).click();
        findElement(By.xpath("//a[@value='"+city_origin+"']")).click();
    }
    public void selectDestinationCity(String city_destination){
        findElement(to).click();
        findElement(By.xpath("(//a[@value='"+city_destination+"'])[2]")).click();
    }
    public void selectDestinationCity2(String city_destination){
        findElement(destination_2).click();
        findElement(By.xpath("(//a[@value='"+city_destination+"'])[3]")).click();
    }
}
