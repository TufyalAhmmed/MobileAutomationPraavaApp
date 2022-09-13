package StepDefination;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.When;
import pages.Map;
import utils.basetests;
import java.net.MalformedURLException;
public class MapSteps {

    private AndroidDriver driver;
    pages.Map map;
    utils.basetests base;

    public MapSteps(basetests base) throws MalformedURLException {

        this.driver = base.setDriver();
        map = new Map(driver);
    }

    @When("Tap on Map")
    public void tap_on_map() throws InterruptedException {
        Thread.sleep(2000);
       map.setMapLink();
    }
}
