package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    By username = new By.ById("username");
    By password = new By.ById("password");
    By loginButton = new By.ById("loginButton");
    By location = new By.ById("Inpatient Ward");

    public LoginPage(WebDriver dr){
        this.driver = dr;
    }
    public void EnterUsername(String sUsername){
        driver.findElement(username).sendKeys(sUsername);

    }
    public void EnterPassword(String sPassword){
        driver.findElement(password).sendKeys(sPassword);

    }
    public void SelectLocation(){
        driver.findElement(location).click();

    }
    public void ClickLogin(){
        driver.findElement(loginButton).click();

    }
    public void LoginToSite(String sUsername, String sPassword){
        this.SelectLocation();
        this.EnterUsername(sUsername);
        this.EnterPassword(sPassword);
        this.ClickLogin();
    }

}
