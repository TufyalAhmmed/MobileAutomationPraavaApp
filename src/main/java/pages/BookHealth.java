package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BookHealth {

    private AndroidDriver driver;

    private By bookhealthcheck = By.xpath("//android.widget.Button[@text='book a health check']");


    public  BookHealth(AndroidDriver driver) {
       //
       this.driver = driver;
    }
    public void setBookhealthcheck(){

        driver.findElement(bookhealthcheck).click();
    }
}
