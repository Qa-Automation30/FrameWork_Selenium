package com.udemy.seleniumDesign.srp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class SearchSuggestion extends AbstractComponent {

    WebDriver driver;
    @FindBy(xpath = "//ul[@role='listbox']//li[@class='sbct']")
    private List<WebElement> suggestions;
    // TODO -> This is lambda Expression from java 8 [This is imp]
    Function<WebDriver, Boolean> result = d->this.suggestions.size()>5;

    public SearchSuggestion(final WebDriver driver){
        super(driver);
    }
    public void clickSuggestionByIndex(int index){
    suggestions.get(index-1).click();
    }
    @Override
    public boolean isDisplayed() {
       return explicitWait(result);
    }
}
