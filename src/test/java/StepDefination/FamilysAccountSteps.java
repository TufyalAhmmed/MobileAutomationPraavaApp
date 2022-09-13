package StepDefination;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.FamilysAccount;
import pages.MembershipPlan;
import utils.basetests;

import java.net.MalformedURLException;

public class FamilysAccountSteps {
    private AndroidDriver driver;
    FamilysAccount familysAccount;
    utils.basetests base;

    public FamilysAccountSteps(basetests base) throws MalformedURLException {

        this.driver = base.setDriver();
        familysAccount = new FamilysAccount(driver);
    }
    @When("Click link your + your family's accounts Button Button")
    public void click_link_your_your_family_s_accounts_button_button() throws InterruptedException {
        Thread.sleep(4000);
        familysAccount.setFamilyAccountLink();
        Thread.sleep(2000);
    }
    @Then("Click Family Account oK Button")
    public void click_family_account_o_k_button() throws InterruptedException {
        Thread.sleep(2000);
        familysAccount.setFamilyAccountOkBtn();
        Thread.sleep(4000);
    }
}
