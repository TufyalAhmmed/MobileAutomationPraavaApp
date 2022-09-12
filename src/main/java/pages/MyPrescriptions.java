package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class MyPrescriptions {
    private AndroidDriver driver;

    private By prescriptionDetails = By.xpath("//android.widget.CheckedTextView[@text='my prescriptions']");



    public  MyPrescriptions(AndroidDriver driver) {
        this.driver = driver;
    }
    public void setPrescriptionDetails(){
        driver.findElement(prescriptionDetails).click();
    }
}
