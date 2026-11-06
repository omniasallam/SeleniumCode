package pages;

import Utlis.SetUtlis;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class DropdownPage {
    private WebDriver driver;
    private By DropdownLocators = By.id("dropdown");

    public DropdownPage(WebDriver driver) {
        this.driver = driver;

    }
    public void selectFromDropdown(String options) {
     //   Select dropdown = new Select(driver.findElement(DropdownLocators));
     //   dropdown.selectByVisibleText(options);
       // SetUtlis setUtlis= new SetUtlis(driver);
      //  setUtlis.fromDropdown(DropdownLocators,options);
        getDropdown().selectByVisibleText(options);
    }
    public  List<String> getSelectedOptipn(){
      List<WebElement> selectedElements=getDropdown().getAllSelectedOptions();
       List<String> selectedOptions= new ArrayList<>();
       for(WebElement element:selectedElements){
           selectedOptions.add(element.getText());
       }
       return selectedOptions;
      }

   public Select getDropdown(){
        return new Select(driver.findElement(DropdownLocators));
    }

}
