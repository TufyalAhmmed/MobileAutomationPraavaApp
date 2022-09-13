package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class FamilysAccount {
    private AndroidDriver driver;

    private By familyAccountLink = By.id("com.praava.patientportal:id/ButtonExcellence");
    private By familyAccountOkBtn = By.id("android:id/button1");

    public  FamilysAccount(AndroidDriver driver) {
        this.driver = driver;
    }
    public void setFamilyAccountLink(){
        driver.findElement(familyAccountLink).click();
    }
    public void setFamilyAccountOkBtn(){
        driver.findElement(familyAccountOkBtn).click();
    }
}
