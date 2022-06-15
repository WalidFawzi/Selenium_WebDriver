package dropdown;

import Pages.DropdownPage;
import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropdownTests extends BaseTests {
    @Test
    public void testSelectOption() {
        var dropdown =  homePage.clickDropdown();
        String option = "Option 1";
        DropdownPage.selectFromDropdown(option);
        var selectedOptions = DropdownPage.getSelectedOption();
        assertEquals(selectedOptions.size(),1 ,"Incorrect Number of selection");
        assertTrue(selectedOptions.contains(option),"Option not selected");

    }
}
