package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramesPage {
    private WebDriver driver;
    private By Body= By.tagName("body");
    private String topFrame= "frame-top";
    private String leftFrame= "frame-left";
    private String middleFrame= "frame-middle";
    private String rightFrame= "frame-right";
    private String bottomFrame= "frame-bottom";
    public NestedFramesPage(WebDriver driver){
        this.driver=driver;
    }
    public String getLeftFrameText(){
        driver.switchTo().frame(topFrame);
       driver.switchTo().frame(leftFrame);
      String leftText= driver.findElement(Body).getText();
      driver.switchTo().defaultContent();
      return leftText;

    }
    public String getBottomFrameText(){
        driver.switchTo().frame(bottomFrame);
        String bottomText= driver.findElement(Body).getText();
        driver.switchTo().parentFrame();
        return bottomText;

    }
}
