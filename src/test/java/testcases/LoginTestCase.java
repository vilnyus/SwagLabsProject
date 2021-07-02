package testcases;

import library.Browser;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

import java.util.concurrent.TimeUnit;

public class LoginTestCase {
    WebDriver driver;
    LoginPage lp;
    HomePage hp;

    @BeforeTest
    public void LaunchBrowser(){
        driver = Browser.StartBrowser("Chrome", "https://demo.openmrs.org/openmrs/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        lp = new LoginPage(driver);
        hp = new HomePage(driver);
    }

    @Test(priority = 1)
    public void LoginTest(){
        lp.LoginToSite("Admin", "Admin123");
    }

    @Test(priority = 2)
    public void HomePageTest(){
        String HomePageText = hp.PageVerify();
        Assert.assertEquals(HomePageText, "Inpatient Ward");
    }

    @Test(priority = 3)
    public void LogoutTest(){
        hp.Logout();
    }

}
