package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropdownPage {
    private static WebDriver driver;
    private static By dropdown = By.id("dropdown");
    public DropdownPage(WebDriver driver) {
        this.driver = driver;
    }
    public static void selectFromDropdown(String option){
       findDropdownElement().selectByVisibleText(option);
    }
    public static List <String> getSelectedOption(){
        List <WebElement> selectedElements = findDropdownElement().getAllSelectedOptions();
        return selectedElements.stream().map(e -> e.getText()).collect(Collectors.toList());
    }

    private static Select findDropdownElement(){
        return new Select(driver.findElement(dropdown));
    }
}
