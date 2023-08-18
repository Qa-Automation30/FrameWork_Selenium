package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CartPage {
    public CartPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//div[@class='cartSection']/h3")
    private List<WebElement> cartSelectionList;
    @FindBy(xpath = "//button[text()='Checkout']")
    private WebElement checkout;

    public String getTheSelectedItem(String _productName){
        WebElement element = cartSelectionList.
                stream().
                filter(s->s.getText().equals(_productName)).
                findFirst().
                orElse(null);
      return element.getText();
    }
    public void clickCheckout()
    {
        checkout.click();
    }
}
