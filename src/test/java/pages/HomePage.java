package pages;

import base.DynamicWaits;
import base.Global;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class HomePage extends Global {
    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//section[@id='products']//div[@class='row']/div")
    private List<WebElement> productNames;
    @FindBy(xpath = "//div[@aria-label='Product Added To Cart']")
    private WebElement toastMessage;
    @FindBy(xpath = "//button[@class='btn btn-custom' and contains(text(),'Cart')]")
    private WebElement cartButton;

    public void selectSpecificProduct(String _productName) throws InterruptedException {
        WebElement result = productNames.
                stream().
                filter(p -> p.findElement(By.tagName("b")).getText().equals(_productName)).
                findFirst().
                orElse(null);
        result.findElement(By.xpath("//div[@class='card-body']//button[text()=' Add To Cart']")).click();
        Thread.sleep(2000);
        String message = toastMessage.getText();
        System.out.println(message);
    }
    public CartPage moveToCart(){
        cartButton.click();
        return new CartPage(getDriver());
    }
}
