package Utlis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SetUtlis {
    private WebDriver driver;
    public SetUtlis(WebDriver driver){
        this.driver= driver;

    }
    public void fromDropdown(By dropdownLocators, String options) {
          Select dropdown = new Select(driver.findElement(dropdownLocators));
          dropdown.selectByVisibleText(options);

    }
}
