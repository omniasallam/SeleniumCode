package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InfiniteScrollPage {
    private WebDriver  driver;
    private By scrollParagraph= By.className("jscroll-added");
    public InfiniteScrollPage(WebDriver driver){
        this.driver=driver;
    }
    public void scrollInToParagraph(int index){
      var js  =(JavascriptExecutor)driver;
        WebElement paragraphElement= driver.findElement(scrollParagraph);
      String script="window.scrollTo(0,document.body.scrollHeight);";
            while (getNumberOfParagraph()<index) {
                js.executeScript(script);
            }
    }
    public int getNumberOfParagraph(){
        return   driver.findElements(scrollParagraph).size();
    }
}
