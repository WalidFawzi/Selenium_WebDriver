package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExamplePage {
    private WebDriver driver;
    private By startBtn = By.xpath("//button[contains(text(),'Start')]");
    private By loadingIndicator = By.id("loading");
    private By result = By.id("finish");

    public ExamplePage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickStart(){
        driver.findElement(startBtn).click();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(loadingIndicator));

    }
    public String getResultText(){
        return driver.findElement(result).getText();
    }
}
