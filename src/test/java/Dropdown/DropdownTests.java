package Dropdown;

import base.baseTest;
import org.testng.Assert;
import org.testng.annotations.Test;


import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropdownTests extends baseTest {
    @Test
    public void testDropdown(){
    var dropdownPage = homePage.clickDropDown();
    String option="Option 1";
     dropdownPage.selectFromDropdown(option);
     List<String> selectedOption =dropdownPage.getSelectedOptipn();
        assertEquals(selectedOption.size()
                ,1,
                " The number of element is not correct");
        assertTrue(selectedOption.contains(option),
                "Option is not select");

    }
}
