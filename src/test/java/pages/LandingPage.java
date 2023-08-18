package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
    WebDriver driver;
    public LandingPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "userEmail")
    private WebElement userNameInput;
    @FindBy(id = "userPassword")
    private WebElement pwdInput;
    @FindBy(id = "login")
    private WebElement submitButton;

    public ProductsPage loginApplication(String userName, String password){
        userNameInput.clear();
        userNameInput.sendKeys(userName);
        pwdInput.clear();
        pwdInput.sendKeys(password);
        submitButton.click();
        return new ProductsPage(driver);
    }
    public String loginInvalidCred(String userName, String password){
        userNameInput.clear();
        userNameInput.sendKeys(userName);
        pwdInput.clear();
        pwdInput.sendKeys(password);
        submitButton.click();
        return "Incorrect email or password.";
    }
}
