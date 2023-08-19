package pages.designPatternsExplain.pageComonents;

import pages.designPatternsExplain.abstractComponent.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * This is the page component of the Main Page
 */

public class HeaderNavigationPage extends AbstractComponent {
    By flights = By.xpath("//*[@id=\"buttons\"]/div/div/ul/li[1]/a/span[2]");
    public HeaderNavigationPage(By by, WebDriver driver){
        super(by,driver);
    }

    public void getSelectedItemName() throws InterruptedException {
        String name = findElement(flights).getText();
        System.out.println(name);
    }
}
