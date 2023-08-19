package pages.anotherpages.pageComonents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.anotherpages.AbstractComponent;

/**
 * This is the page component of the Main Page
 */

public class FooterNavigationPage extends AbstractComponent {
    WebDriver driver;
    public FooterNavigationPage(WebElement element,WebDriver driver){
      super(element,driver);
    }

   public void selectOption(String _option){
        findElement(driver.findElement(By.xpath("div[@id='traveller-home']//span[text()='"+_option+"']"))).click();
   }
}
