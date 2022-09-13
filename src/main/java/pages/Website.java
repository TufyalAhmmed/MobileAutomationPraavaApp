package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class Website {
    private AndroidDriver driver;

    private By websiteLink = By.xpath("(//android.support.v7.widget.LinearLayoutCompat)[9]");


    public  Website(AndroidDriver driver) {
        this.driver = driver;
    }
    public void setWebsiteLink(){
        driver.findElement(websiteLink).click();
    }
}
