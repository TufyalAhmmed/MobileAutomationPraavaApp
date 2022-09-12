package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class HCWSYB {
    private AndroidDriver driver;

    private By membershipLink = By.id("com.praava.patientportal:id/ButtonFeedback");
    private By hcwsybBtn = By.id("\t\n" +
            "android:id/button1");


    public  HCWSYB (AndroidDriver driver) {
        this.driver = driver;
    }
    public void setMembershipLink(){
        driver.findElement(membershipLink).click();

    }
    public void setHcwsybBtn(){
        driver.findElement(hcwsybBtn).click();

    }
}
