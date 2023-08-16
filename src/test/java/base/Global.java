package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;

public class Global {
    static WebDriver driver;
    public WebDriver getDriver(){
        if(driver==null){
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.get("https://rahulshettyacademy.com/client");
            return driver;
        }
        return driver;
    }
    @AfterSuite
    void terDown(){
        driver.quit();
    }
}
