package WebProductsTests;

import Z_Utility.BaseDriver;
import Z_Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/*
Bu siteye gidiniz. https://testpages.herokuapp.com/styled/index.html
Fake Alerts'e tıklayınız.
Show modal dialog buttonuna tıklayınız.
Ok'a tıklayınız.
Alert kapanmalıdır.
 */
public class _06_herokuapp extends BaseDriver {
    @Test
    public void Test6()
    {
        browser.get("https://testpages.herokuapp.com/styled/index.html");
        MyFunc.Wait(1);

        WebElement fakeAlerts = browser.findElement(By.xpath("//*[@id='fakealerttest']"));
        fakeAlerts.click();
        MyFunc.Wait(1);

        WebElement showModalDialog = browser.findElement(By.xpath("//*[@id='modaldialog']"));
        showModalDialog.click();
        MyFunc.Wait(1);

        WebElement okButton = browser.findElement(By.xpath("//*[@id='dialog-ok']"));
        okButton.click();
        MyFunc.Wait(1);

        WebElement closeTheAlert = browser.findElement(By.xpath("//*[@class='page-navigation']"));
        closeTheAlert.click();

        BekleKapat();
    }
}
