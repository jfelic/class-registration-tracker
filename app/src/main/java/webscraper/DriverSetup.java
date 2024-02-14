/*
* This class will be used to open a browser
* and to navigate to the login page
*/

package webscraper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverSetup {
    
    public WebDriver creatWebDriver() {
        WebDriver driver = new FirefoxDriver();
        return driver;
    }
}
