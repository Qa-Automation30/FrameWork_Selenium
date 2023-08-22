package com.udemy.seleniumDesign.srp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.function.Function;

public class SearchWidget extends AbstractComponent {
    WebDriver driver;
    @FindBy(name="q")
    private WebElement searchBox;

    // TODO -> This is lambda Expression from java 8 [This is imp]
    Function<WebDriver,Boolean> function = d->searchBox.isDisplayed();

    public SearchWidget(final WebDriver driver){
        super(driver);
    }
    public void enter(String keyWord){
        searchBox.clear();
        searchBox.sendKeys(keyWord);
    }
    @Override
    public boolean isDisplayed() {
       return explicitWait(function);
    }
}
