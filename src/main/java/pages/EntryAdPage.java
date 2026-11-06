package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EntryAdPage {
    private WebDriver driver;
    private By closeLink= By.xpath("//p[text()=\"Close\"]");
    private By entryAdHeader= By.cssSelector(".example h3");
    public EntryAdPage(WebDriver driver){
        this.driver=driver;
    }
    public void clickCloseButton(){
        driver.findElement(closeLink).click();
    }
    public String getHeaderEntryAd(){
        return driver.findElement(entryAdHeader).getText();
    }
}
