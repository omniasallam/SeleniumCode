package Navigate;

import base.baseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class WindowsTests extends baseTest {
    @Test
    public void testMultipleWindow(){
      var newWindowPage =  homePage.clickMultipleWindows().clickButtonHere();
             getWindowManager().switchTab("windows/new");
             String currentUrl= newWindowPage.getHeader();
        assertTrue(currentUrl.contains("/windows/new"));


    }
    @Test
    public void testMultipleWindow1(){
        var newWindowPage =  homePage.clickMultipleWindows().clickButtonHere();
        getWindowManager().switchTab("New Window");
        String headerText= newWindowPage.getHeaderText();
      assertEquals(headerText,"New Window");


    }
}
