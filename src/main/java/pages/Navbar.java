package pages;

import io.appium.java_client.AppiumFluentWait;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Navbar {
    private AndroidDriver driver;

    private By nav = By.xpath("//android.widget.ImageButton");


    public  Navbar(AndroidDriver driver) {
        this.driver = driver;
    }
    public void setNav(){
        driver.findElement(nav).click();
//        AppiumFluentWait wait = new AppiumFluentWait(driver );
//        wait.until(ExpectedConditions.elementToBeClickable(nav));
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].click();", driver.findElement(nav));
    }
}
