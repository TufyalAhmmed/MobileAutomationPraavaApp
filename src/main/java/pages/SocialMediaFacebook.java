package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class SocialMediaFacebook {
    private AndroidDriver driver;

    private By socialMediaFacebookLink = By.xpath("(//android.widget.ImageView)[2]");


    public  SocialMediaFacebook(AndroidDriver driver) {
        this.driver = driver;
    }
    public void setSocialMediaFacebookLink(){
        driver.findElement(socialMediaFacebookLink).click();
    }
}
