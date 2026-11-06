package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamaicLoadingEx1page {
    private WebDriver driver;
    private By finish= By.cssSelector("#finish h4");
    private By buttonStart= By.cssSelector("#start button");
    public DynamaicLoadingEx1page(WebDriver driver){
        this.driver=driver;
    }
    public void clickButtonStart(){
        driver.findElement(buttonStart).click();
    }

    public String getFinish(){
     //  try {
        //    Thread.sleep(3000);
      //  } catch (InterruptedException e) {
        //    throw new RuntimeException(e);
        //  }
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
      wait.until(ExpectedConditions.visibilityOf(driver.findElement(finish)));
        return driver.findElement(finish).getText();
    }


}
