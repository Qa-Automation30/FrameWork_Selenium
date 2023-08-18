package pages;

import base.AbstractComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.stream.Collectors;

public class HeaderPage extends AbstractComponent {
    WebDriver driver;
    public HeaderPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        this.driver=driver;
    }
    @FindBy(xpath = "//button[@class='btn btn-custom']")
    private List<WebElement> allOptions;

    public List<String> getAllOptions(){
        List<String> options = allOptions.
                stream().
                map(op->op.getText().trim()).collect(Collectors.toList());
        return options;
    }
    public void moveToPages(String button){
        // op->op.getText().trim().equalsIgnoreCase(button) -> This can be turn into predicate
        allOptions.
                stream().
                filter(op->op.getText().trim().equalsIgnoreCase(button)).
                findFirst().
                orElse(null).
                click();
    }
}
