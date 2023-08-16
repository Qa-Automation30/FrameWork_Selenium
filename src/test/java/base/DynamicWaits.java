package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicWaits {
    WebDriver driver;
    WebDriverWait wait;
    public DynamicWaits(WebDriver driver){
        this.driver=driver;
    }

    public void invisibilityOf(WebElement element){
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.invisibilityOf(element));
    }
}
