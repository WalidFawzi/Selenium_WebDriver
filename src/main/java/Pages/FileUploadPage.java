package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {
    private WebDriver driver;
    private By inputField = By.id("file-upload");
    private By uploadBtn = By.id("file-submit");
    private By uploadedFiles = By.id("uploaded-files");
    public FileUploadPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickUploadBtn (){
        driver.findElement(uploadBtn).click();
    }

    public void uploadFile (String path){
        driver.findElement(inputField).sendKeys(path);
        clickUploadBtn();
    }
    public String getUploadedFilesText(){
        return driver.findElement(uploadedFiles).getText();
    }
}
