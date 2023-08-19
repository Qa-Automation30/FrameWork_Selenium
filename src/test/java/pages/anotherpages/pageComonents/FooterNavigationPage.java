package pages.anotherpages.pageComonents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.anotherpages.abstractComponent.AbstractComponent;

/**
 * This is the page component of the Main Page
 */

public class FooterNavigationPage extends AbstractComponent {
    WebDriver driver;
    By flights = By.xpath("//div[@id='traveller-home']//span[text()='Flights']");

    public FooterNavigationPage(By by,WebDriver driver){
      super(by,driver);
      this.driver=driver;
    }

    /**
     *  clicking on the flight button
     * @throws InterruptedException
     */
   public void selectOption() throws InterruptedException {
        findElement(flights).click();
   }
}
