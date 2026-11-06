package Js;

import base.baseTest;
import org.testng.annotations.Test;

public class JsExecutorTests extends baseTest {
    @Test
    public void testScrollToTable(){
        var largeAndDeepPage=homePage.clickLargeAndDeepDom();
              largeAndDeepPage.scrollToTable();
    }
    @Test
    public void testScrollParagraph(){
        homePage.clickInfiniteScroll().scrollInToParagraph(5);
    }
}
