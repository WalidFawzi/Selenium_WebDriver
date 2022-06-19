package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlertsTests extends BaseTests {

    @Test
    public void testAcceptAlert(){
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerAlert();
        alertsPage.acceptAlert();
        assertEquals(alertsPage.getResult(),"You successfully clicked an alert","Incorrect Message");
    }

    @Test
    public void testCancelAlert(){
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerConfirmAlert();
        alertsPage.cancelAlert();
        assertEquals(alertsPage.getTextMsg(),"You clicked: Cancel","Incorrect Msg");
    }
    @Test
    public void testPromptAlert(){
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerPromptAlert();
        alertsPage.setPrompt("Waleed");
        assertEquals(alertsPage.getTextAfterPrompt(),"You entered: Waleed","Incorrect Message");

    }
}
