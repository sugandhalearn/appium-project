package cucumberIntegrationTests.stepDefinitions.common;

import cucumber.api.java.en.Given;
import cucumberIntegrationTests.CreateAppiumSessionCucumber;
import cucumberIntegrationTests.screens.android.ListingScreen;
import org.openqa.selenium.WebDriver;

public class BaseSteps {
    CreateAppiumSessionCucumber createAppiumSessionCucumber;
    public WebDriver driver;
    String platform;
    ListingScreen listingScreen;


    @Given("^User has catify \"([^\"]*)\" app$")
    public void userHasCatifyApp(String invokeDriver) throws Exception {

        platform = invokeDriver;
        createAppiumSessionCucumber = new CreateAppiumSessionCucumber();
        createAppiumSessionCucumber.createDriver(invokeDriver, BaseSteps.class.getDeclaredMethod("userHasCatifyApp", String.class));
        driver = createAppiumSessionCucumber.getWebDriver();

        if (invokeDriver.equalsIgnoreCase("android")) {
            listingScreen = new ListingScreen(driver);
        }
    }
}
