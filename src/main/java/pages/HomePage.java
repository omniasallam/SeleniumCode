package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    //private By formAuthenticationLink = By.linkText("Form Authentication");
    //private By DropDownLink= By.linkText("Dropdown");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage clickFormAuthentication() {
      //  driver.findElement(formAuthenticationLink).click();
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }
    public DropdownPage clickDropDown(){
     //  driver.findElement(DropDownLink).click();
        clickLink("Dropdown");
       return new DropdownPage(driver);
    }
    public Hoverpage clickHover(){
        clickLink("Hovers");
        return new Hoverpage(driver);
    }
    public KeyPressPage clickKeyPress(){
        clickLink("Key Presses");
        return new KeyPressPage(driver);
    }
    public JavaScriptAlertPage clickJavaScriptAlert(){
        clickLink("JavaScript Alerts");
        return new JavaScriptAlertPage(driver);
    }
    public FileUploadpage clickFileUpload(){
        clickLink("File Upload");
        return new FileUploadpage(driver);
    }
    public EntryAdPage clickEntryAd(){
        clickLink("Entry Ad");
        return new EntryAdPage(driver);
    }
    public FramePage clickFrame(){
        clickLink("Frames");
        return new FramePage(driver);
    }
    public DynamicLoadingPage clickDynamicLoading(){
        clickLink("Dynamic Loading");
        return new DynamicLoadingPage(driver);
    }
    public LargeAndDeepDomPage clickLargeAndDeepDom(){
        clickLink("Large & Deep DOM");
        return new LargeAndDeepDomPage(driver);
    }
    public InfiniteScrollPage clickInfiniteScroll(){
        clickLink("Infinite Scroll");
        return new InfiniteScrollPage(driver);
    }
    public MultipleWindowsPage clickMultipleWindows(){
        clickLink("Multiple Windows");
        return new MultipleWindowsPage(driver);
    }
    public void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }
}
