package WebProductsTests;

import Z_Utility.BaseDriver;
import Z_Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/*
Bu websitesine gidiniz. [https://testpages.herokuapp.com/styled/index.html]
Calculate'e tıklayınız.
İlk input'a herhangi bir sayı giriniz.
İkinci input'a herhangi bir sayı giriniz.
Calculate button'una tıklayınız.
Sonucu alınız.
Sonucu yazdırınız.
 */
public class _04_herokuapp extends BaseDriver {
    @Test
    public void Test4()
    {
        browser.get("https://testpages.herokuapp.com/styled/index.html");
        MyFunc.Wait(1);

        WebElement calculate = browser.findElement(By.xpath("//a[@id='calculatetest']"));
        calculate.click();
        MyFunc.Wait(1);

        WebElement numberOne = browser.findElement(By.xpath("//input[@id='number1']"));
        numberOne.sendKeys("14");
        MyFunc.Wait(1);

        WebElement numberTwo = browser.findElement(By.xpath("//input[@id='number2']"));
        numberTwo.sendKeys("53");
        MyFunc.Wait(1);

        WebElement calculateButton = browser.findElement(By.xpath("//input[@id='calculate']"));
        calculateButton.click();
        MyFunc.Wait(1);

        WebElement answer = browser.findElement(By.xpath("//span[@id='answer']"));
        Assert.assertTrue(answer.getText().contains("67"));
        System.out.println("The answer " + answer.getText());

        BekleKapat();
    }
}
