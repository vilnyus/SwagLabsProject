package library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
    public static WebDriver driver;

    public static WebDriver StartBrowser(String sBrowserName, String sUrl){
        if(sBrowserName.equalsIgnoreCase("Chrome")){
            System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Projects\\SwagLabsProject\\src\\test\\resources\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        else if (sBrowserName.equalsIgnoreCase("Firefox")){
            System.setProperty("webdriver.gecko.driver", "D:\\Selenium_Projects\\SwagLabsProject\\src\\test\\resources\\geckodriver.exe");
            driver = new FirefoxDriver();
        }
        else if(sBrowserName.equalsIgnoreCase("Edge")){
            System.setProperty("webdriver.edge.driver", "D:\\Selenium_Projects\\SwagLabsProject\\src\\test\\resources\\msedgedriver.exe");
        }

        driver.manage().window().maximize();
        driver.get(sUrl);
        return driver;
    }
}
