package WebProductsTests;

import Z_Utility.BaseDriver;
import Z_Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/*
1) Bu siteye gidin. -> https://demo.applitools.com/
2) Username kısmına "ttechno@gmail.com" girin.
3) Password kısmına "techno123." girin.
4) "Sign in" buttonunan tıklayınız.
5) "Your nearest branch closes in: 30m 5s" yazısının göründüğünü doğrulayınız.
 */
public class _03_applitools extends BaseDriver {
    @Test
    public void Test2()
    {
        browser.get("https://demo.applitools.com/");
        MyFunc.Wait(2);

        WebElement userName = browser.findElement(By.xpath("//input[@id='username']"));
        userName.sendKeys("ttechno@gmail.com");
        MyFunc.Wait(2);

        WebElement passWord = browser.findElement(By.xpath("//input[@id='password']"));
        passWord.sendKeys("techno123.");
        MyFunc.Wait(2);

        WebElement signButton = browser.findElement(By.xpath("//a[@id='log-in']"));
        signButton.click();
        MyFunc.Wait(2);

        WebElement True = browser.findElement(By.xpath("//h6[@id='time']"));
        Assert.assertTrue(True.getText().contains("Your nearest branch closes in: 30m 5s"));
        System.out.println("True.getText() = " + True.getText());

        BekleKapat();
    }
}
