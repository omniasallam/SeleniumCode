package Utlis;

import org.openqa.selenium.WebDriver;

import java.util.Set;

public class WindowManager {
    private WebDriver driver;
    public WindowManager(WebDriver driver){
        this.driver=driver;
    }
    public void goBack(){
        driver.navigate().back();
    }
    public void goForward(){

        driver.navigate().forward();
    }
    public void refresh(){
        driver.navigate().refresh();
    }
    public void goTo( String url){
        driver.navigate().to(url);
    }

    public void switchTab(String  tabTitle){
       Set<String> windowHandles =driver.getWindowHandles();
       for (String windowHandle: windowHandles){
           System.out.println("THe current Wwindow Handle is " + windowHandle);
           driver.switchTo().window(windowHandle);
           if (driver.getCurrentUrl().equals(tabTitle)){
               break;
           }
       }
    }

}
