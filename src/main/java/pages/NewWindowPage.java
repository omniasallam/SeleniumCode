package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewWindowPage {
    private WebDriver driver;
    private By header=By.cssSelector(".example> h3");
    public NewWindowPage(WebDriver driver){
        this.driver=driver;
    }
    public String getHeader(){
       return driver.getCurrentUrl();
    }
    public String getHeaderText(){
        return driver.findElement(header).getText();
    }
}
