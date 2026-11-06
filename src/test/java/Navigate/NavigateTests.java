package Navigate;

import Utlis.WindowManager;
import base.baseTest;
import org.testng.annotations.Test;

public class NavigateTests extends baseTest {
    @Test
    public void testNavigation(){
        homePage.clickDynamicLoading().clickDynamicLoadingEx1();
       getWindowManager().goBack();
       getWindowManager().goForward();
       getWindowManager().refresh();
       getWindowManager().goTo("https://www.google.com/");
    }
}
