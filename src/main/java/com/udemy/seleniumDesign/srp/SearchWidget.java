package com.udemy.seleniumDesign.srp;

import com.google.common.util.concurrent.Uninterruptibles;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.stream.Stream;

public class SearchWidget extends AbstractComponent {
    WebDriver driver;
    @FindBy(name="q")
    private WebElement searchBox;

    // TODO -> This is lambda Expression from java 8 [This is imp]
    Function<WebDriver,Boolean> function = d->searchBox.isDisplayed();

    public SearchWidget(final WebDriver driver){
        super(driver);
    }
  /*  public void searchKeyWord(String keyWord){
        searchBox.clear();
       for(char ch : keyWord.toCharArray()){
           Uninterruptibles.sleepUninterruptibly(20, TimeUnit.MICROSECONDS);
           searchBox.sendKeys(ch+"");
       }
    }*/
  public void searchKeyWord(String keyWord){
      searchBox.clear();
        keyWord.chars().mapToObj(ch->
        {
            return (char) ch+"";
        }).forEach(searchBox::sendKeys);
  }
    @Override
    public boolean isDisplayed() {
       return explicitWait(function);
    }
}
