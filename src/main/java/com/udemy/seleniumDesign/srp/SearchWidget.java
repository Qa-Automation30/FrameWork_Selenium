package com.udemy.seleniumDesign.srp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class SearchWidget extends AbstractComponent {
    WebDriver driver;
    @FindBy(name="q")
    private WebElement searchBox;

    public SearchWidget(final WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver=driver;
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
