package cucumberIntegrationTests.screens.android;

import UITestFramework.GenericMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ListingScreen extends GenericMethods {

    public ListingScreen(WebDriver driver) {
        super(driver);
    }

    // Locators on the listing screen
    public By listofcatcard = By.xpath("//androidx.cardview.widget.CardView");
    public By listofcattext = By.xpath("//androidx.cardview.widget.CardView//android.widget.TextView[@text='Abyssinian']");
    public By catdetailname = By.id("com.catify.catify:id/detailName");
    public By catdetailtemperament = By.id("com.catify.catify:id/detailTemperament");
    public By catdetailenergylevel = By.id("com.catify.catify:id/detailEnergyLevel");
    //Error page locator
    public By errorpage = By.xpath("//*[contains(text(),'Something went wrong please try again later')]");
}
