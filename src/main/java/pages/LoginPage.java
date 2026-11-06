package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By userField= By.id("username");
    private By passwordField = By.id("password");
    private By LoginButton= By.cssSelector("#login>button");
    public LoginPage(WebDriver driver){
        this.driver=driver;
    }
    public void setUserName(String name){
driver.findElement(userField).sendKeys(name);
    }
    public void setPassword(String password){
driver.findElement(passwordField).sendKeys(password);
    }
public  SecureAreaPage clickLoginButton(){
        driver.findElement(LoginButton).click();
        return new SecureAreaPage(driver);
}
}
