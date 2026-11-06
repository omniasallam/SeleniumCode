package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicLoadingEx2Page {
    private WebDriver driver;
    private By finish= By.cssSelector("#finish h4");
    private By buttonStart= By.cssSelector("#start button");
    public DynamicLoadingEx2Page(WebDriver driver){
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
        wait.until(ExpectedConditions.presenceOfElementLocated(finish));
       wait.until(ExpectedConditions.visibilityOf(driver.findElement(finish)));
      //  wait.until(ExpectedConditions.visibilityOfElementLocated(finish));

    //    FluentWait wait = new FluentWait<>(driver)
      //          .withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(2));

       // wait.until(ExpectedConditions.visibilityOfElementLocated(finish));
     //  wait.until(driver -> {
    //       System.out.println("Checking the element");
          //         return driver.findElement(finish).isDisplayed();
     //  });
        return driver.findElement(finish).getText();
    }


}
