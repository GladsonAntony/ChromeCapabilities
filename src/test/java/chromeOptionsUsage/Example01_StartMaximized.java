/**
 * User: Gladson Antony
 * Date: 18-April-2020
 * Time: 22:25
 */

package chromeOptionsUsage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Example01_StartMaximized
{
    WebDriver driver;

    @Test
    public void testChromeOptions_StartMaximized() throws Exception
    {
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        //Start Maximized
        chromeOptions.addArguments("--start-maximized");
        driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.google.co.in");
        System.out.println("Page Title --> "+driver.getTitle());
        driver.close();
        driver.quit();
    }
}
