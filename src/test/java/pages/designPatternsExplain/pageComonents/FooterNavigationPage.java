package pages.designPatternsExplain.pageComonents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.designPatternsExplain.abstractComponent.AbstractComponent;

/**
 * This is the page component of the Main Page
 */

public class FooterNavigationPage extends AbstractComponent {
    By flights = By.xpath("//*[@id=\"buttons\"]/div/div/ul/li[1]/a/span[2]");

    public FooterNavigationPage(By by,WebDriver driver){
      super(by,driver);
    }

    /**
     *  clicking on the flight button
     * @throws InterruptedException
     */
   public void selectOption() throws InterruptedException {
        findElement(flights).click();
   }
}
