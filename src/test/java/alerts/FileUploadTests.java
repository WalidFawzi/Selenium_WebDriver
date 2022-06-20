package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTests {

    @Test
    public void testFileUpload(){
        var fileUploadPage = homePage.clickFileUpload();
        fileUploadPage.uploadFile("C:\\Users\\WAE021\\IdeaProjects\\SeleniumWebDriver\\src\\main\\resources\\TestNG.png");
        assertEquals(fileUploadPage.getUploadedFilesText(),"TestNG.png","incorrect message");
    }
}
