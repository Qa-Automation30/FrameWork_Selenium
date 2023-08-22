package com.udemy.seleniumDesign.srp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class AbstractComponent {
    public abstract boolean isDisplayed();

    public WebDriverWait wait;
    public void visibilityOfElement(WebDriver driver, WebElement element){
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    public void waitUntilToLoadResults(Function<WebDriver,Boolean> function){
        wait.until(function);
    }
}
