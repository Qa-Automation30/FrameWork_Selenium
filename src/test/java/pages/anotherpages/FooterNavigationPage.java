package pages.anotherpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FooterNavigationPage {
    WebDriver driver;
   @FindBy(id = "traveller-home")
   private WebElement footerSection;

   public void selectOption(String _option){
    driver.findElement(By.xpath("div[@id='traveller-home']//span[text()='"+_option+"']")).click();
   }
}
