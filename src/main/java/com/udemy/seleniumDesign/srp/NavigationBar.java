package com.udemy.seleniumDesign.srp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.function.Function;

public class NavigationBar extends AbstractComponent {

    @FindBy(xpath = "//div[@role='navigation']//div[@id='bqHHPb']//div//div/span")
    private List<WebElement> navigationOptions;
    @FindBy(xpath = "//div[@role='navigation']//div[@id='bqHHPb']")
    private WebElement navigationBar;

    // TODO -> This is lambda Expression from java 8 [This is imp]
    Function<WebDriver,Boolean> function = d->navigationBar.isDisplayed();

    public NavigationBar(final WebDriver driver) {
        super(driver);
    }
    public void goToNavigationOption(String option){
        navigationOptions.
                stream().
                filter(e->e.getText().equalsIgnoreCase(option)).forEach(e->e.click());
    }

    @Override
    public boolean isDisplayed() {
        explicitWait(function);
        return false;
    }
}
