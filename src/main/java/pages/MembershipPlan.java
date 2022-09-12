package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class MembershipPlan {
    private AndroidDriver driver;

    private By membershipLink = By.id("com.praava.patientportal:id/Buttonmembership");
    private By membershipOkBtn = By.xpath("//android.widget.Button[@text='OK']");

    public  MembershipPlan (AndroidDriver driver) {
        this.driver = driver;
    }
    public void setMembershipLink(){
        driver.findElement(membershipLink).click();
    }
    public void setMembershipOkBtn(){
        driver.findElement(membershipOkBtn).click();
    }
}
