package WebProductsTests;

import Z_Utility.BaseDriver;
import Z_Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/*
1) Bu siteye gidin. -> https://www.snapdeal.com/
2) "teddy bear" aratın ve Search butonuna tıklayın.
3) Bu yazının göründüğünü doğrulayınız. -> (We've got 297 results for 'teddy bear')
Not: Bu yazıdaki sayı değişiklik gösterebilir. Önemli olan cümle kalıbı.
 */
public class _03_snapdeal extends BaseDriver {
    @Test
    public void Test3()
    {
        browser.get("https://www.snapdeal.com/");
        MyFunc.Wait(2);

        WebElement bearTed = browser.findElement(By.xpath("//input[@id='inputValEnter']"));
        bearTed.sendKeys("teddy bear");
        MyFunc.Wait(1);

        WebElement searchBox = browser.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']"));
        searchBox.click();
        MyFunc.Wait(1);

        WebElement write = browser.findElement(By.xpath("//*[@id='searchMessageContainer']"));
        Assert.assertTrue("Couldn't Find It",write.getText().contains("We've got 62 results for teddy bear"));
        System.out.println("write.getText() = " + write.getText());

        // gereksinimlerde bu adım istenilmedi ama ben kendimi geliştirebilmek adına ekledim
        if (write.getText().equals("We've got 62 results for teddy bear"))
            System.out.println("Could Find It");


        BekleKapat();
    }
}
