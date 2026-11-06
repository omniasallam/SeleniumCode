package base;

import Utlis.WindowManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;

import java.time.Duration;

public class baseTest {
    private WebDriver driver;
    protected HomePage homePage;
@BeforeClass
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }
@BeforeMethod
public void goHome(){
    driver.get("https://the-internet.herokuapp.com/");
    homePage= new HomePage(driver);
}
    @AfterClass
    public void tearDown(){

    driver.quit();
    }

    public WindowManager getWindowManager(){
    return new WindowManager(driver);
    }

}

