package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MultipleWindowsPage {
    private WebDriver driver;
    private By multipleWwindowsLink= By.linkText("Click Here");
    public MultipleWindowsPage(WebDriver driver){
        this.driver=driver;
    }
    public NewWindowPage clickButtonHere(){
        driver.findElement(multipleWwindowsLink).click();
        return new NewWindowPage(driver);
    }
}
