package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By username = By.id("username");
    private By password = By.id("password");
    private By loginBtn = By.className("radius");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void setUsername(String name){
        driver.findElement(username).sendKeys(name);
    }
    public void setPassword(String pass){
        driver.findElement(password).sendKeys(pass);
    }
    public SecureAreaPage clickLoginBtn(){
        driver.findElement(loginBtn).click();
        return new SecureAreaPage(driver);
    }
}
