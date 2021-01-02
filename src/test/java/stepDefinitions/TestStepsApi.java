package stepDefinitions;

import api.ApiHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static io.restassured.RestAssured.given;

public class TestStepsApi {

    ApiHelper apiHelper = new ApiHelper();

    @Given("Set Endpoint")
    public void set_endpoint() {
        apiHelper.setEndPoint("https://reqres.in/api/register");
    }

    @When("Set Request Header")
    public void set_request_header() {
        apiHelper.setHeader();
    }

    @And("Send POST HTTP Request")
    public void send_post_http_request() {
        apiHelper.postEmailAndPassword("eve.holt@reqres.in","pistol");
    }

    @Then("Valid Response received with token")
    public void valid_response_received_with_token() {
        apiHelper.testStatusCode200();
        apiHelper.getToken();

    }

    @Given("Set Endpoint2")
    public void set_endpoint2() {
        apiHelper.setEndPoint("https://reqres.in/api/register");
    }

    @When("Set Request Header2")
    public void set_request_header2() {

            apiHelper.setHeader();
    }
    @When("Send POST HTTP Request2")
    public void send_post_http_request2() {
        apiHelper.postOnlyEmail("eve.holt@reqres.in");
    }
    @Then("Valid Response received with Error")
    public void valid_response_received_with_error() {
        apiHelper.testStatusCode400();
    }

    @Given("Set Endpoint3")
    public void set_endpoint3() {
        apiHelper.setEndPoint("https://reqres.in/api/users");
    }

    @When("Send GET HTTP Request")
    public void send_get_http_request() {
        apiHelper.getUsers();
    }
    @Then("Valid Response received with List of Users")
    public void valid_response_received_with_list_of_users() {
        apiHelper.testStatusCode200();
    }

}
