package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KeyPressPage {
   private WebDriver driver;
   private By inputLocator= By.id("target");
   private By resultMessage= By.id("result");
   public KeyPressPage(WebDriver driver){
       this.driver=driver;
   }
   public void setText(String text){
       driver.findElement(inputLocator).sendKeys(text);
   }
   public  String getResultMessage(){
       return driver.findElement(resultMessage).getText();
   }
}
