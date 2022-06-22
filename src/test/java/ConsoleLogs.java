import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.idealized.log.Log;
import org.openqa.selenium.devtools.idealized.log.model.LogEntry;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ConsoleLogs{
   ChromeDriver driver;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void viewBrowserConsoleLogs() {
        DevTools devTools = driver.getDevTools();
        devTools.createSession();
        devTools.send(Log.enable());
        devTools.addListener(log.entryAdded(), logEntry -> {
            System.out.println("----------");
            System.out.println("Level : " + logEntry.getLevel());
            System.out.println("Text : " + logEntry.getText());
            System.out.println("Broken URL : " + logEntry.getUrl);
        });
        driver.get("https://the-internet.herokuapp.com/broken_images");
    }
}
