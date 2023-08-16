package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {
    public HomePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//section[@id='products']//div[@class='row']/div")
    private List<WebElement> productNames;

    void selectSpecificProduct(String _productName){
      WebElement result =  productNames.
              stream().
              filter(p->p.findElement(By.tagName("b")).getText().equals(_productName)).
              findFirst().
              orElse(null);
      result.findElement(By.xpath("//div[@class='card-body']//button[text()=' Add To Cart']")).click();
    }
}
