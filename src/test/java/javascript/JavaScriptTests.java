package javascript;

import base.BaseTests;
import org.testng.annotations.Test;

public class JavaScriptTests extends BaseTests {
    @Test
    public void JavaScriptTests() {
        var largePage = homePage.clickLargeAndDeepDomLink();
        largePage.scrollToTable();
    }
}
