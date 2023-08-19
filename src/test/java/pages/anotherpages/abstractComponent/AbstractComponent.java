package pages.anotherpages.abstractComponent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class AbstractComponent {
    WebElement element;
    WebDriver driver;

    public AbstractComponent(By by, WebDriver driver) {
        this.element = driver.findElement(by);
        this.driver = driver;
    }

    public WebElement findElement(By by) {
        return element.findElement(by);
    }
}
