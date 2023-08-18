package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage {
    WebDriver driver;
    public CheckOutPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver=driver;
    }
    @FindBy(xpath = "//a[text()='Place Order ']")
    private WebElement placeOrderBtn;
    @FindBy(xpath = "//div[contains(text(),'Enter Full Shipping Information')]")
    private WebElement popupMessage;

    /**
     * Click on place order button and get the appropriate message.
     * @return
     */
    public String placeOrderBtn(){
        placeOrderBtn.click();
        return popupMessage.getText();
    }
}
