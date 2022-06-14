package Login;

import Pages.LoginPage;
import Pages.SecureAreaPage;
import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LoginTests extends BaseTests {

    @Test
    public void testSuccessfulLogin() {
        LoginPage loginPage = homePage.clickFormAuthLink();
        loginPage.setUsername("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickLoginBtn();
        assertEquals(secureAreaPage.getAlertText(), "You logged into a secure area! x"
               ,"Alert text incorrect");

    }
}
