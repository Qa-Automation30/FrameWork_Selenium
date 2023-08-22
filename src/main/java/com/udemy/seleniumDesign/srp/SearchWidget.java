package com.udemy.seleniumDesign.srp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchWidget extends AbstractComponent {
    WebDriver driver;
    @FindBy(name="q")
    private WebElement searchBox;

    public SearchWidget(final WebDriver driver){
        super(driver);
    }
    public void enter(String keyWord){
        searchBox.clear();
        searchBox.sendKeys(keyWord);
    }
    @Override
    public boolean isDisplayed() {
        visibilityOfElement(driver,searchBox);
        return searchBox.isDisplayed();
    }
}
