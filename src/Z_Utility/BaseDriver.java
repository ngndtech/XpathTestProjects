package Z_Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseDriver {

    public static WebDriver browser;

    static
    {
        browser = new ChromeDriver();

        browser.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    public static void BekleKapat()
    {
        MyFunc.Wait(3);
        browser.quit();
    }

}
