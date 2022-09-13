package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class MyPrescriptions {
    private AndroidDriver driver;

    private By prescriptionDetails = By.xpath("(//android.support.v7.widget.LinearLayoutCompat)[3]");



    public  MyPrescriptions(AndroidDriver driver) {
        this.driver = driver;
    }
    public void setPrescriptionDetails(){
        driver.findElement(prescriptionDetails).click();
    }
}
