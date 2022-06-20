package frames;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FrameTests extends BaseTests {

    @Test
    public void testFrames() {
        String text = "Waleed";
        var editorPage = homePage.clickEditors();
        editorPage.clearTextArea();
        editorPage.setTextArea(text);
        assertEquals(editorPage.getTextFromEditor(),text,"Incorrect Message");
    }
}
