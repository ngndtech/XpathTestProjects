package WebProductsTests;

import Z_Utility.BaseDriver;
import Z_Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ByIdOrName;

/*
  1) Bu siteye gidin. -> http://demoqa.com/text-box
  2) Full Name kısmına "Automation" girin.
  3) Email kısmına "Testing@gmail.com" girin.
  4) Current Address kısmına "Testing Current Address" girin.
  5) Permanent Address kısmına "Testing Permanent Address" girin.
  6) Submit butonuna tıklayınız.
  7) Full Name'in, "Automation"ı içinde bulundurduğunu doğrulayın.
  8) Email'in, "Testing"ı içinde bulundurduğunu doğrulayın.
*/
public class _01_demoqa extends BaseDriver {
    @Test
    public void Test1()
    {
        browser.get("http://demoqa.com/text-box");

        WebElement userName = browser.findElement(ByIdOrName.xpath("//input[@id='userName']"));
        userName.sendKeys("Automation");
        MyFunc.Wait(1);

        WebElement eMail = browser.findElement(By.xpath("//input[@id='userEmail']"));
        eMail.sendKeys("Testing@gmail.com");
        MyFunc.Wait(2);

        WebElement currentAddress = browser.findElement(By.xpath("//textarea[@id='currentAddress']"));
        currentAddress.sendKeys("Testing Current Address");
        MyFunc.Wait(2);

        WebElement permanetAddress = browser.findElement(By.xpath("//textarea[@id='permanentAddress']"));
        permanetAddress.sendKeys("Testing Permanent Address");

        WebElement submitButton = browser.findElement(By.xpath("//button[@class='btn btn-primary']"));
        submitButton.click();
        MyFunc.Wait(2);

        WebElement IsThereName = browser.findElement(By.xpath("//p[@id='name']"));
        Assert.assertTrue("Couldn't Find ", IsThereName.getText().contains("Automation"));
        System.out.println("Full Name = " + IsThereName.getText());
        MyFunc.Wait(2);

        WebElement IsThereEmail = browser.findElement(By.xpath("//p[@id='email']"));
        Assert.assertTrue("Couldn't Find ", IsThereEmail.getText().contains("Testing@gmail.com"));
        System.out.println("Email = " + IsThereEmail.getText());


        BekleKapat();
    }
}
