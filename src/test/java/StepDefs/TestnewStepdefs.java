package StepDefs;

import com.ecommerce.pages.HomePage;
import com.ecommerce.utils.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestnewStepdefs {

    private WebDriver driver;
    HomePage homePage;
    public TestnewStepdefs(){
        this.driver = DriverFactory.getDriver();
        this.homePage = new HomePage(driver);

    }

    @Given("user click url")
    public void userClickUrl() {
        homePage.OpenHomePage();
    }

    @Then("home page opened")
    public void homePageOpened() {
        Assert.assertEquals(homePage.pageTitle(),"Online Shopping & Wholesale Marketplace in MENA | Tradeling");
    }
}
