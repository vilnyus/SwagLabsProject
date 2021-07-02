package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;
    By logout = new By.ByLinkText("Logout");
    By location = new By.ById("selected-location");

    public HomePage(WebDriver dr){
        this.driver = dr;
    }
    public String PageVerify(){
        return driver.findElement(location).getText();
    }
    public void Logout(){
        driver.findElement(logout).click();
    }
}
