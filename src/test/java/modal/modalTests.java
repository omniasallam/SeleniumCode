package modal;

import base.baseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class modalTests extends baseTest {
    @Test
    public void testModal(){
      var entryAd= homePage.clickEntryAd();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        entryAd.clickCloseButton();
      assertEquals(entryAd.getHeaderEntryAd(), "Entry Ad",
              "The header is not correct");
    }
}
