package KeyPress;

import base.baseTest;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class KeyPressTests extends baseTest {
    @Test
    public void testKeyPress(){
    var keyPressPage=homePage.clickKeyPress();
    // keyPressPage.setText("a"+Keys.BACK_SPACE);
         keyPressPage.setText(Keys.chord(Keys.SHIFT,"a"));
       assertEquals(keyPressPage.getResultMessage(),"You entered: A",
               "Message is incorrect");
    }
}
