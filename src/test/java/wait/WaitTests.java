package wait;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class WaitTests extends BaseTests {
    @Test
    public void testWaits() {
        var dynamicLoadingPage = homePage.clickDynamicLoadingLink();
       var examplePage = dynamicLoadingPage.clickExample1();
       examplePage.clickStart();
       assertEquals(examplePage.getResultText(),"Hello World!","Incorrect Msg");
    }
}
