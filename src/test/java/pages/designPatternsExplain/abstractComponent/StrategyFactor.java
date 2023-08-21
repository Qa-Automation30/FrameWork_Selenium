package pages.designPatternsExplain.abstractComponent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.designPatternsExplain.pageComonents.MultiCity;
import pages.designPatternsExplain.pageComonents.RoundTrip;

public class StrategyFactor {
    WebDriver driver;
    By sectionElement = By.id("flightSearchContainer");
    public StrategyFactor(WebDriver driver){
        this.driver=driver;
    }
    public SearchFlights createStrategy(String strategyType ){
        if(strategyType.equalsIgnoreCase("multiTrip")){
            return new MultiCity(sectionElement,driver);
        }
        else if(strategyType.equalsIgnoreCase("roundTrip")){
            return new RoundTrip(sectionElement,driver);
        }
        return null;
    }
}
