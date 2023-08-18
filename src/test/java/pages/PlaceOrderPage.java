package pages;

import base.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class PlaceOrderPage extends AbstractComponent {
    WebDriver driver;
    public PlaceOrderPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
        this.driver=driver;
    }
    @FindBy(xpath = "//a[text()='Place Order ']")
    private WebElement placeOrderBtn;
    @FindBy(xpath = "//div[@id='toast-container']/div/div")
    private WebElement popupMessage;
    @FindBy(xpath = "//input[@placeholder='Select Country']")
    private WebElement selectCountry;
    @FindBy(xpath = "//input[@placeholder='Select Country']/following-sibling::section//button//span")
    private List<WebElement> countryListDropdown;

    /**
     * Click on place order button and get the appropriate message.
     * @return
     */
    public String placeOrderBtn(){
        placeOrderBtn.click();
        visibilityOf(popupMessage);
        return popupMessage.getText();
    }
    public void selectCountry(String _country){
        selectCountry.sendKeys(_country);
        countryListDropdown.
                stream().
                peek(s->System.out.println(s.getText())).
                filter(s->s.getText().equalsIgnoreCase(_country)).
                forEach(WebElement::click);
    }
}
