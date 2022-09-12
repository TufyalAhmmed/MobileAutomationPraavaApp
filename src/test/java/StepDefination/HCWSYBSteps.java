package StepDefination;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Then;
import pages.HCWSYB;
import pages.MembershipPlan;
import utils.basetests;

import java.net.MalformedURLException;

public class HCWSYBSteps {
    private AndroidDriver driver;
    HCWSYB hcwsyb;
    utils.basetests base;

    public HCWSYBSteps(basetests base) throws MalformedURLException {

        this.driver = base.setDriver();
        hcwsyb= new HCWSYB(driver);
    }
    @Then("Click How can we serve you better Button")
    public void click_how_can_we_serve_you_better_button() throws InterruptedException {
        Thread.sleep(2000);
        hcwsyb.setMembershipLink();
    }
}
