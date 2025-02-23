package stepdefinitions.web;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSteps {
    WebDriver driver;

    @Given("User is on the login page")
    public void userIsOnLoginPage() {
        // Set path ke ChromeDriver (pastikan path ini sesuai dengan lokasi file di komputermu)
        System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.get("https://www.demoblaze.com/");
    }

    @When("User enters valid username and password")
    public void userEntersValidCredentials() {
        // Implement login logic here
    }

    @And("User clicks on login button")
    public void userClicksLoginButton() {
        // Implement button click here
    }

    @Then("User should be redirected to homepage")
    public void userRedirectedToHomepage() {
        // Implement assertion here
    }
}
