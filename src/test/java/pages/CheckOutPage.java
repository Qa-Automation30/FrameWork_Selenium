package pages;

import base.AbstractComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage extends AbstractComponent {
    public CheckOutPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
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
        visibilityOf(popupMessage);
        return popupMessage.getText();
    }
}
