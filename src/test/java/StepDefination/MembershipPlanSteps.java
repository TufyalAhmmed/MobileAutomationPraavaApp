package StepDefination;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Then;
import pages.MembershipPlan;
import pages.MyLabReports;
import utils.basetests;

import java.net.MalformedURLException;

public class MembershipPlanSteps {
    private AndroidDriver driver;
    MembershipPlan membershipPlan;
    utils.basetests base;

    public MembershipPlanSteps(basetests base) throws MalformedURLException {

        this.driver = base.setDriver();
        membershipPlan = new MembershipPlan(driver);
    }
    @Then("Tap on sign up for a membership plan")
    public void tap_on_sign_up_for_a_membership_plan() throws InterruptedException {
        Thread.sleep(2000);
        membershipPlan.setMembershipLink();

    }
    @Then("Click Membership oK Button")
    public void click_membership_o_k_button() throws InterruptedException {
        Thread.sleep(2000);
        membershipPlan.setMembershipOkBtn();
        Thread.sleep(4000);

    }
}
