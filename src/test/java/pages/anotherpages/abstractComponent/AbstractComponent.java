package pages.anotherpages.abstractComponent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class AbstractComponent {
    WebElement element;
    WebDriver driver;

    public AbstractComponent(WebElement element, WebDriver driver) {
        this.element = element;
        this.driver = driver;
    }

    public WebElement findElement(WebElement element) {
        return element.findElement((By) element);
    }
}
