package Waits;

import base.baseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class WaitsTests extends baseTest {
    @Test
    public void testWaits(){
       var ex1Page= homePage.clickDynamicLoading().clickDynamicLoadingEx1();
       ex1Page.clickButtonStart();
      assertEquals(ex1Page.getFinish(),"Hello World!",
              "The text is not visible yet");
    }
    @Test
    public void testWaits2(){
        var ex2Page= homePage.clickDynamicLoading().clickDynamicLoadingEx2();
        ex2Page.clickButtonStart();
        assertEquals(ex2Page.getFinish(),"Hello World!",
                "The text is not visible yet");
    }


}
