package WebProductsTests;

import Z_Utility.BaseDriver;
import Z_Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
/*
Bu websitesine gidiniz. [https://testpages.herokuapp.com/styled/index.html]
Fake Alerts' tıklayınız.
Show Alert Box'a tıklayınız.
Ok'a tıklayınız.
Alert kapanmalıdır.
 */
public class _05_herokuapp extends BaseDriver {
    @Test
    public void Test5()
    {

        browser.get("https://testpages.herokuapp.com/styled/index.html");
        MyFunc.Wait(1);

        WebElement fakeAlerts = browser.findElement(By.xpath("//*[@id='fakealerttest']"));
        fakeAlerts.click();
        MyFunc.Wait(1);

        WebElement showAlert = browser.findElement(By.xpath("//*[@id='fakealert']"));
        showAlert.click();
        MyFunc.Wait(1);

        WebElement okButton = browser.findElement(By.xpath("//*[@id='dialog-ok']"));
        okButton.click();
        MyFunc.Wait(1);


        WebElement closeTheAlert = browser.findElement(By.xpath("//*[@class='page-navigation']"));
        closeTheAlert.click();

        BekleKapat();

    }
}
