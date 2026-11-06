package Login;

import base.baseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;


public class LoginTests extends baseTest {
    @Test
    public void testSuccessfulLogin(){
      var LoginPage=homePage.clickFormAuthentication();
      LoginPage.setUserName("tomsmith");
      LoginPage.setPassword("SuperSecretPassword!");
      var SecureAreaPage=LoginPage.clickLoginButton();
      String message=SecureAreaPage.getMessage();
assertTrue(message.contains("You logged into a secure area!"),
        "You didn`t login");


    }
}
