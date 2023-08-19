package pages.anotherpages.MainPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
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

}
