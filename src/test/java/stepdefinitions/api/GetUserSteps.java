package stepdefinitions.api;

import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;

public class GetUserSteps {
    Response response;

    @Given("API endpoint for user exists")
    public void apiEndpointExists() {
        RestAssured.baseURI = "https://dummyapi.io/data/v1/user/";
    }

    @When("I send a GET request to fetch user")
    public void sendGetRequest() {
        response = RestAssured.given()
                .header("app-id", "YOUR_APP_ID")
                .when()
                .get("60d0fe4f5311236168a109ca");
    }

    @Then("The response should contain user details")
    public void validateResponse() {
        response.then().statusCode(200).body("id", notNullValue());

        // Cetak response body ke console untuk debugging
        System.out.println("Response Body:");
        System.out.println(response.prettyPrint());
    }

}
