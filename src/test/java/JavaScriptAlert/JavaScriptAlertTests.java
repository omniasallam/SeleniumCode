package JavaScriptAlert;

import base.baseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class JavaScriptAlertTests extends baseTest {
    @Test
    public void testAlert(){
       var javaScriptAlertPage= homePage.clickJavaScriptAlert();
       javaScriptAlertPage.clickJsAlert();
        assertEquals(javaScriptAlertPage.getButtonAlert(),"I am a JS Alert",
                "The alert Text is not correct");
       javaScriptAlertPage.acceptButtonAlert();
       assertEquals(javaScriptAlertPage.getMessageResult(),"You successfully clicked an alert",
               "The result message is not correct");


    }
    @Test
    public void testConfirm(){
        var javaScriptAlertPage= homePage.clickJavaScriptAlert();
        javaScriptAlertPage.clickJsConfirm();
        assertEquals(javaScriptAlertPage.getButtonAlert(),"I am a JS Confirm",
                "The alert Text is not correct");
        javaScriptAlertPage.dimissButtonConfirm();
        assertEquals(javaScriptAlertPage.getMessageResult(),"You clicked: Cancel",
                "The result message is not correct");


    }
    @Test
    public void testPrompt(){
        var javaScriptAlertPage= homePage.clickJavaScriptAlert();
        javaScriptAlertPage.clickJsPrompt();
        assertEquals(javaScriptAlertPage.getButtonAlert(),"I am a JS prompt",
                "The alert Text is not correct");
        javaScriptAlertPage.getButtonPrompt("Route");
        javaScriptAlertPage.acceptButtonAlert();
        assertEquals(javaScriptAlertPage.getMessageResult(),"You entered: Route",
                "The result message is not correct");


    }

}
