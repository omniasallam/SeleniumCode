package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadpage {
    private WebDriver driver;
    private By fileUpload=By.id("file-upload");
    private By fileSubmitted=By.id("file-submit");
    private By uploadedFile=By.id("uploaded-files");
    public FileUploadpage(WebDriver driver){
        this.driver=driver;
    }
    public void uploadFile(String abslouteFilePath){
        driver.findElement(fileUpload).sendKeys( abslouteFilePath);
    }
    public void clickSubmitButton(){
        driver.findElement(fileSubmitted).click();
    }
    public String getUploadedFile(){
        return driver.findElement(uploadedFile).getText();
    }
}
