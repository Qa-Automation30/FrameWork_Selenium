package com.udemy.seleniumDesign.srp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class AbstractComponent {
    public abstract boolean isDisplayed();
    protected WebDriverWait wait;
    public AbstractComponent(final WebDriver driver){
        this.wait = new WebDriverWait(driver,Duration.ofSeconds(20));
        PageFactory.initElements(driver,this);
    }
    public void explicitWait(Function<WebDriver,Boolean> function){
        wait.until(function);
    }
}
