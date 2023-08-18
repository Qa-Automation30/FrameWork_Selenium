package pages;

import base.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.stream.Collectors;

public class ProductsPage extends AbstractComponent {
    WebDriver driver;
    public ProductsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        this.driver=driver;
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
        /**
         * below are the concept of scoping the driver.
         */
        // Here we are adding the specific product to cart
        result.findElement(By.xpath("//div[@class='card-body']//button[text()=' Add To Cart']")).click();
        invisibilityOf(toastMessage);
    }
    public CartPage goToCart(){
        cartButton.click();
        return new CartPage(driver);
    }
}
