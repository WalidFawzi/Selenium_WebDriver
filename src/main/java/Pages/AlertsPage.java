package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {
    private WebDriver driver;
    private By clickJsAlertBtn = By.xpath("//button[contains(text(),'Click for JS Alert')]");
    private By result = By.id("result");
    private By clickJsConfirmBtn = By.xpath("//button[contains(text(),'Click for JS Confirm')]");
    private By messageAfterConfirm = By.xpath("//p[@id='result']");
    private By clickJsPromptBtn = By.xpath("//button[contains(text(),'Click for JS Prompt')]");
    private By resultAfterPrompt = By.xpath("//p[@id='result']");

    public AlertsPage(WebDriver driver){
        this.driver = driver;
    }
    public void triggerAlert(){
        driver.findElement(clickJsAlertBtn).click();
    }
    public void triggerConfirmAlert(){
        driver.findElement(clickJsConfirmBtn).click();
    }
    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }
    public void cancelAlert(){
        driver.switchTo().alert().dismiss();
    }
    public String getResult (){
       return  driver.findElement(result).getText();
    }
    public String getTextMsg(){
        return driver.findElement(messageAfterConfirm).getText();
    }
    public String getTextAfterPrompt(){
        return  driver.findElement(resultAfterPrompt).getText();
    }
    public void triggerPromptAlert(){
        driver.findElement(clickJsPromptBtn).click();
    }
    public void setPrompt (String text){
        driver.switchTo().alert().sendKeys(text);
        driver.switchTo().alert().accept();
    }

}
