package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class SocialMedia {
    private AndroidDriver driver;

    private By socialMediaLink = By.xpath("(//android.support.v7.widget.LinearLayoutCompat)[8]");

    public  SocialMedia(AndroidDriver driver) {
        this.driver = driver;
    }
    public void setSocialMediaLink(){
        driver.findElement(socialMediaLink).click();
    }
}
