package hovers;

import base.baseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class hoversTests extends baseTest {
    @Test
    public void testHovers(){
        var hoverPage=homePage.clickHover();
        int index=1;
       var figureCaption= hoverPage.hoverOverFigure(index);
       assertTrue(figureCaption.isCaptionDisplayed(),
               "The caption is not displayed" );
       assertEquals(figureCaption.getName(), "name: user" +index,
               "The name is incorrect");
       assertEquals(figureCaption.getLinkText(),"View profile",
               "The link text is incorrect");
       assertTrue(figureCaption.getLinkUrl().contains("/users/" +index),
               "The link is incorrect");
    }
}
