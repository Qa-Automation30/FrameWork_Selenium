package testCases.baseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

public class BaseTest {

    static WebDriver driver;
    static FileInputStream fis;
    static Properties prop;

    /**
     *  This method is responsible to invoke driver
     * @return
     */
    public WebDriver getDriver() {
        if (driver == null) {
            if(getGlobalData().getProperty("browser").equalsIgnoreCase("Chrome")){
                driver = new ChromeDriver();
            }
            else if(getGlobalData().getProperty("browser").equalsIgnoreCase("FF"))
            {
                driver = new FirefoxDriver();
            }
            else {
                // Print the logs here later, write now just put the "Sysout"
                System.out.println("Please enter the valid Browser to execute the test cases");
                System.exit(1);
            }
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            driver.get("https://rahulshettyacademy.com/client");
            return driver;
        }
        return driver;
    }
    /**
     *  This method is responsible for to load the data from properties file
     * @return
     */
    public static Properties getGlobalData() {
        try {
            fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\resources\\globalData.config");
            prop = new Properties();
            prop.load(fis);
            return prop;
        } catch (Exception exception) {
            System.out.println(exception.toString());
            return null;
        }
    }
}
