package testCases.baseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {

    static WebDriver driver;
    public WebDriver getDriver(){
        if(driver==null){
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            driver.get("https://rahulshettyacademy.com/client");
            return driver;
        }
        return driver;
    }
}
