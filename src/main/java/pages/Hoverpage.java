package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class Hoverpage {
    private WebDriver driver;
    private By figureBox= By.className("figure");
    private By figcaptionLocators=By.className("figcaption");
    public Hoverpage (WebDriver driver){
        this.driver= driver;
    }
    public FigCaption hoverOverFigure(int index){
        Actions actions= new Actions(driver);
        WebElement figure=driver.findElements(figureBox).get(index-1);
        actions.moveToElement(figure).perform();
        return new FigCaption(figure.findElements(figcaptionLocators).get(index-1));
    }
    public class FigCaption{
        private WebElement caption;
        private By nameLocatorsFig=By.tagName("h5");
        private By linkLocatorsFig=By.tagName("a");
        public FigCaption(WebElement caption){
            this.caption=caption;
        }
        public boolean isCaptionDisplayed(){
            return caption.isDisplayed() ;
        }
        public String getName(){
            return caption.findElement(nameLocatorsFig).getText();
        }
        public String getLinkText(){
            return caption.findElement(linkLocatorsFig).getText();
        }
        public String getLinkUrl(){
            return caption.findElement(linkLocatorsFig).getAttribute("href");
        }
    }

}
