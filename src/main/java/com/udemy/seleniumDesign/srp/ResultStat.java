package com.udemy.seleniumDesign.srp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.function.Function;

public class ResultStat extends AbstractComponent{

    @FindBy(id="result-stats")
    private WebElement resultStats;

    Function<WebDriver,Boolean> function = d->resultStats.isDisplayed();

    public ResultStat(WebDriver driver) {
        super(driver);
    }
    public String getStat(){
        return resultStats.getText();
    }

    @Override
    public boolean isDisplayed() {
       return explicitWait(function);
    }
}
