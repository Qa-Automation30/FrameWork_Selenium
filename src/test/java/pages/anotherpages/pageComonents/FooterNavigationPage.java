package pages.anotherpages.pageComonents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.anotherpages.abstractComponent.AbstractComponent;

/**
 * This is the page component of the Main Page
 */

public class FooterNavigationPage extends AbstractComponent {
    WebDriver driver;
    By flights = By.xpath("//div[@id='traveller-home']//span[text()='Flights']");
    public FooterNavigationPage(WebElement element,WebDriver driver){
      super(element,driver);
      this.driver=driver;
    }

   public void selectOption(String _option) throws InterruptedException {
       // findElement(flights).click();
        Thread.sleep(3000);
   }
}
