package FileUpload;

import base.baseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends baseTest {
      @Test
    public void testFileUpload(){
        var fileUploadpage=  homePage.clickFileUpload();
        fileUploadpage.uploadFile("\"C:\\Users\\Leno 20AU26\\Downloads\\Automation assignment part 2.pdf\"");
        fileUploadpage.clickSubmitButton();
        assertEquals(fileUploadpage.getUploadedFile(),"Automation assignment part 2.pdf",
                "The file name is incorrect");
      }
}
