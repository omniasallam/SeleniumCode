package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavaScriptAlertPage {
    private WebDriver driver;
    private By buttonAlert=By.xpath("//button[contains(.,'Alert')]");
    private By buttonConfirm=By.xpath("//button[contains(.,'Click for JS Confirm')]");
    private By buttonPrompt=By.xpath("//button[contains(.,'Prompt')]");
    private By messageResult=By.id("result");
    public JavaScriptAlertPage(WebDriver driver){
        this.driver=driver;
    }
    public void clickJsAlert(){
        driver.findElement(buttonAlert).click();
    }
    public void clickJsConfirm(){
        driver.findElement(buttonConfirm).click();
    }
    public void clickJsPrompt(){
        driver.findElement(buttonPrompt).click();
    }
    public void acceptButtonAlert(){
        driver.switchTo().alert().accept();
    }
    public String getButtonAlert(){
        return driver.switchTo().alert().getText();
    }
    public void dimissButtonConfirm(){
        driver.switchTo().alert().dismiss();
    }
    public void getButtonPrompt(String text){
          driver.switchTo().alert().sendKeys(text);
    }
    public String getMessageResult(){
       return driver.findElement(messageResult).getText();
    }

}
