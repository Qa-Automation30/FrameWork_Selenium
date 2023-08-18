package pages.anotherpages;
/**
 *  It is a kind of Main or Base Class page , which consist of sections like :
 *  1) Header navigation bar
 *  2) footer navigation bar
 *
 *  Note : It is a kind of Master class
 */
public class TravelHomePage {

    public HeaderNavigationPage getHeaderNavigation(){
        return new HeaderNavigationPage();
    }
    public FooterNavigationPage getFooterNavigation(){
        return new FooterNavigationPage();
    }

}
