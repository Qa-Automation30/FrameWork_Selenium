package pages.designPatternsExplain.MainPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.designPatternsExplain.pageComonents.FooterNavigationPage;
import pages.designPatternsExplain.pageComonents.HeaderNavigationPage;

/**
 *  It is a kind of Main or Base Class page , which consist of sections like :
 *  1) Header navigation bar
 *  2) footer navigation bar
 *  3) MidSection
 *
 *  Note : It is a kind of Master class (It is basically the landing page of the Application)
 */
public class TravelHomePage {
    WebDriver driver;
    /**
     * So this is the footerSection WebElement >> which is having whole footerSection
     */
    By footerSection = By.id("traveller-home");
    /**
     * So this is the headerSection WebElement >> which is having whole headerSection
     */
    By headerSection = By.id("buttons");

    public TravelHomePage(WebDriver driver) {
        this.driver=driver;
    }
    /**
     * Component of HeaderNavigation >> which provides the object of the "HeaderNavigation"
     * @return
     */
    public HeaderNavigationPage getHeaderNavigation(){
        return new HeaderNavigationPage(headerSection,driver);
    }

    /**
     * Component of footerNavigation >> which provides the object of the "FooterNavigationPage"
     *
     * Note : Imp point is that here you are navigating to the "FooterNavigationPage" class and
     *        that class having "WebElements" which are related to that footer section only.
     *        So the question is how selenium knows that you need to go only inside that footer section and find the elements ?
     *        So we need to design our frameWork in such a way that it go and search only inside the footer Section.
     *        have recorded one element above named as -> "footerSection".
     * @return
     */
    public FooterNavigationPage getFooterNavigation(){
        return new FooterNavigationPage(footerSection,driver);
    }

    /**
     * Navigate to travel Page (landing page URL)
     */
    public void goToTravelPage(){
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
    }

}
