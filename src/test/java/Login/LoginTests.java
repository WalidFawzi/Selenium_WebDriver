package Login;

import Pages.LoginPage;
import Pages.SecureAreaPage;
import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LoginTests extends BaseTests {

    @Test
    public void testSuccessfulLogin() {
        LoginPage loginPage = homePage.clickFormAuthLink();
        loginPage.setUsername("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickLoginBtn();
        assertTrue(secureAreaPage.getAlertText().contains("You logged into a secure area!"),"Alert is incorrect");


    }
}
