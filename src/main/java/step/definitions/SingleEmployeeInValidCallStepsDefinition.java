package step.definitions;

import employee.resources.SingleEmployeeResources;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class SingleEmployeeInValidCallStepsDefinition {

    String baseUrl = "";
    String resourcePath = "";
    String objectId = "5c4be5af2fc21350f886bdc7/dummy";
    int actualStatusCode = 0;
    int expectedStatusCode = 404;

    @Given("baseUrl and invalid resourcePath")
    public void baseurl_and_invalid_resourcePath(){
        baseUrl = "http://info.venturepulse.org:8080/service-webapp";
        resourcePath = "/api/SingleEmployeeResources/";
    }

    @When("Make a invalid GET call")
    public void make_a_invalid_GET_call(){
        actualStatusCode = SingleEmployeeResources.getSingleEmployeeResourcesUnSuccessfulStatus(baseUrl,resourcePath,objectId);
    }

    @Then("I should receive status code 404")
    public void i_should_receive_status_code(){
        Assert.assertEquals(actualStatusCode,expectedStatusCode);
    }

}
