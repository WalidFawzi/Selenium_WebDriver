package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {
    private WebDriver driver;
    private By example1 = By.xpath("//a[contains(text(),'Example 1: Element on page that is hidden')]");
    public DynamicLoadingPage(WebDriver driver){
        this.driver = driver;
    }
    public ExamplePage clickExample1 (){
        driver.findElement(example1).click();
        return new ExamplePage(driver);
    }
}
