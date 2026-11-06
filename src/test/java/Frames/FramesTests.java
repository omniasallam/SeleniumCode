package Frames;

import base.baseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class FramesTests extends baseTest {
    @Test
    public void testFrame(){
       var nestedFrames= homePage.clickFrame().clickNestedFrames();
      assertTrue(nestedFrames.getLeftFrameText().contains("LEFT"),
              "The left frame is not correct");
        assertTrue(nestedFrames.getBottomFrameText().contains("BOTTOM"),
                "The bottom frame is not correct");

    }

}
