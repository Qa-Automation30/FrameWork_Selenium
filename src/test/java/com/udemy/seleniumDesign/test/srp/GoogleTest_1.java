package com.udemy.seleniumDesign.test.srp;

import com.udemy.seleniumDesign.srp.GoogleMainPage;
import com.udemy.seleniumDesign.srp.GoogleResultPage;
import com.udemy.seleniumDesign.test.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleTest_1 extends BaseTest {
    private GoogleMainPage googleMainPage;
    private GoogleResultPage googleResultPage;

    @BeforeTest
    public void setupPages(){
        googleMainPage = new GoogleMainPage(driver);
        googleResultPage = new GoogleResultPage(driver);
    }
    @Test
    public void googleWorkFlow(){
        googleMainPage.goTo();
        Assert.assertTrue(googleMainPage.getSearchWidget().isDisplayed());
        googleMainPage.getSearchWidget().searchKeyWord("selenium news");
        Assert.assertTrue(googleMainPage.getSearchSuggestion().isDisplayed());
        googleMainPage.getSearchSuggestion().clickSuggestionByIndex(4);
       // Assert.assertTrue(googleResultPage.getNavigationBar().isDisplayed());
        googleResultPage.getSearchWidget().searchKeyWord("selenium news");
        Assert.assertTrue(googleMainPage.getSearchSuggestion().isDisplayed());
        googleMainPage.getSearchSuggestion().clickSuggestionByIndex(3);
        googleResultPage.getNavigationBar().goToNavigationOption("news");
        System.out.println(googleResultPage.getResultStat().getStat());
    }
}
