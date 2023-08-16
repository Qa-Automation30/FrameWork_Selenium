package pages;

import base.Global;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    HomePage homePage;
    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "userEmail")
    private WebElement userNameInput;
    @FindBy(id = "userPassword")
    private WebElement pwdInput;
    @FindBy(id = "login")
    private WebElement submitButton;

    public HomePage loginApplication(String userName, String password){
        userNameInput.sendKeys(userName);
        pwdInput.sendKeys(password);
        submitButton.click();
        return homePage;
    }
}
