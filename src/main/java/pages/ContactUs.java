package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class ContactUs {
    private AndroidDriver driver;

    private By contactusBtn= By.id("com.praava.patientportal:id/ButtonEmergency");


    public  ContactUs(AndroidDriver driver) {
        this.driver = driver;
    }
    public void setContactusBtn(){
        driver.findElement(contactusBtn).click();
    }
}
