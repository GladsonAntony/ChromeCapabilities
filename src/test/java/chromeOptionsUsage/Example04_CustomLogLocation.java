/**
 * User: Gladson Antony
 * Date: 20-April-2020
 * Time: 08:45
 */
package chromeOptionsUsage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Example04_CustomLogLocation
{
    WebDriver driver;

    @Test
    public void testChromeOptions_TestCustomLogLocation() throws Exception
    {
        System.setProperty("webdriver.chrome.logfile", "./target/Example04_CustomLogLocation.log");
        System.setProperty("webdriver.chrome.verboseLogging", "true");
        WebDriverManager.chromedriver().arch64().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        //Start In Headless Mode
        chromeOptions.addArguments("--headless");
        driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.google.co.in");
        System.out.println("Page Title --> " + driver.getTitle());
        driver.close();
        driver.quit();
    }
}
