package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {
    private WebDriver driver;
    private By exLink= By.partialLinkText("Example 1");
    private By ex2Link= By.partialLinkText("Example 2");
    public DynamicLoadingPage(WebDriver driver){
        this.driver=driver;
    }
    public DynamaicLoadingEx1page clickDynamicLoadingEx1(){
        driver.findElement(exLink).click();
        return new DynamaicLoadingEx1page(driver);

    }
    public DynamicLoadingEx2Page clickDynamicLoadingEx2(){
        driver.findElement(ex2Link).click();
        return new DynamicLoadingEx2Page(driver);
    }
}
