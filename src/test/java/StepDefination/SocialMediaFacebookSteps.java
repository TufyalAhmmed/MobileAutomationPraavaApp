package StepDefination;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Then;
import pages.MembershipPlan;
import pages.SocialMediaFacebook;
import utils.basetests;

import java.net.MalformedURLException;

public class SocialMediaFacebookSteps {
    AndroidDriver driver;
    SocialMediaFacebook socialMediaFacebook;
    utils.basetests base;

    public SocialMediaFacebookSteps(basetests base) throws MalformedURLException {

        this.driver = base.setDriver();
        socialMediaFacebook = new SocialMediaFacebook(driver);
    }
    @Then("Social Media Facebook Button")
    public void social_media_facebook_button() throws InterruptedException {
        Thread.sleep(2000);
       socialMediaFacebook.setSocialMediaFacebookLink();
    }
}
