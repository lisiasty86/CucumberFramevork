package CucumberFramework.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginSteps {
    @And("^User clicks on the login button$")
    public void userClicksOnTheLoginButton() throws Throwable {
        System.out.println("userClicksOnTheLoginButton");
    }

    @Given("^User navigates to stackoverflow website$")
    public void userNavigatesToStackoverflowWebsite() throws Throwable {
        System.out.println("userNavigatesToStackoverflowWebsite");
    }

    @And("^User enters a correct username$")
    public void userEntersACorrectUsername() throws Throwable {
        System.out.println("userEntersACorrectUsername");
    }

    @And("^User enters a correct password$")
    public void userEntersACorrectPassword() throws Throwable {
        System.out.println("userEntersACorrectPassword");
    }

    @Then("^User should be taken to the successful login page$")
    public void userShouldBeTakenToTheSuccessfulLoginPage() throws Throwable {
        System.out.println("userShouldBeTakenToTheSuccessfulLoginPage");
    }




    @Given("^User navigates to stackoverflow website(\\d+)$")
    public void userNavigatesToStackoverflowWebsite(int arg0) throws Throwable {
        System.out.println("userNavigatesToStackoverflowWebsite2");
    }

    @And("^User clicks on the login button(\\d+)$")
    public void userClicksOnTheLoginButton(int arg0) throws Throwable {
        System.out.println("userClicksOnTheLoginButton2");
    }

    @And("^User enters a correct username(\\d+)$")
    public void userEntersACorrectUsername(int arg0) throws Throwable {
        System.out.println("userEntersACorrectUsername2");
    }

    @And("^User enters a correct password(\\d+)$")
    public void userEntersACorrectPassword(int arg0) throws Throwable {
        System.out.println("userEntersACorrectPassword2");
    }

    @Then("^User should be taken to the successful login page(\\d+)$")
    public void userShouldBeTakenToTheSuccessfulLoginPage(int arg0) throws Throwable {
        System.out.println("userShouldBeTakenToTheSuccessfulLoginPage2");
    }
}
