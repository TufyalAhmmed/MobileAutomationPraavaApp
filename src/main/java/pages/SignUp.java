package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class SignUp {

    private AndroidDriver driver;

        private By signupBtn = By.id("com.praava.patientportal:id/signup_link");
        private By mobile = By.id("com.praava.patientportal:id/mobile");
        private By nameField = By.id("com.praava.patientportal:id/username");
        private By passwordField = By.id("com.praava.patientportal:id/password");
        private By reenterPassword = By.id("com.praava.patientportal:id/re_password");
        private By email           = By.id("com.praava.patientportal:id/emailId");
        private By signUpButton = By.id("com.praava.patientportal:id/sign_up_button");



    public  SignUp(AndroidDriver driver) {
        this.driver = driver;
    }

    public void setSignupBtn(){
        driver.findElement(signupBtn).click();
    }
    public void setMobile(){
        driver.findElement(mobile).sendKeys("1679560509");
    }
    public void setNameField(){
        driver.findElement(nameField).sendKeys("Tufyal");

    }
    public void setPasswordField(){
        driver.findElement(passwordField).sendKeys("Tufyal12!");
    }
    public void  setReenterPassword(){
        driver.findElement(reenterPassword).sendKeys("Tufyal12!");
    }
    public void setEmail(){
        driver.findElement(email).sendKeys("tufyal.qups@gmail.com");
    }
    public void setSignupButton(){
        driver.findElement(signUpButton).click();
    }
}
