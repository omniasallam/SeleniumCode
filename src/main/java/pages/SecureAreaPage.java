package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {
    private WebDriver driver;
    private By SecureMessage= By.id("flash");
    public SecureAreaPage(WebDriver driver){
        this.driver=driver;
    }
    public String getMessage(){
     //  String message= driver.findElement(SecureMessage).getText();
     //  return message;
       return driver.findElement(SecureMessage).getText();
    }
}
