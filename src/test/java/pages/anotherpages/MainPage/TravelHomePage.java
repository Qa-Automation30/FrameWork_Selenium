package pages.anotherpages.MainPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.anotherpages.pageComonents.FooterNavigationPage;
import pages.anotherpages.pageComonents.HeaderNavigationPage;

/**
 *  It is a kind of Main or Base Class page , which consist of sections like :
 *  1) Header navigation bar
 *  2) footer navigation bar
 *
 *  Note : It is a kind of Master class
 */
public class TravelHomePage {
    WebDriver driver;
    @FindBy(id = "traveller-home")
    private WebElement footerSection;

    public TravelHomePage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    /**
     * Component of HeaderNavigation
     * @return
     */
    public HeaderNavigationPage getHeaderNavigation(){
        return new HeaderNavigationPage();
    }

    /**
     * Component of footerNavigation
     * @return
     */
    public FooterNavigationPage getFooterNavigation(){
        return new FooterNavigationPage(footerSection,driver);
    }

    /**
     * Navigate to travel Page
     */
    public void goToTravelPage(){
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
    }

}
