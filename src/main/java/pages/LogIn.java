package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class LogIn {

    private AndroidDriver driver;

    private By mobile = By.id("com.praava.patientportal:id/login_user");
    private By password = By.id("com.praava.patientportal:id/login_password");
    private By submitbtn = By.id("com.praava.patientportal:id/login_btn");


    public  LogIn(AndroidDriver driver) {
        this.driver = driver;
    }
    public void setMobile(){
        driver.findElement(mobile).sendKeys("1679560509");
    }
    public void setPassword(){
        driver.findElement(password).sendKeys("Tufyal12!");
    }
    public void setSubmitbtn(){
        driver.findElement(submitbtn).click();
    }

}
