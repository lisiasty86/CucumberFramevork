package CucumberFramework.steps;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginSteps {

    WebDriver driver;

    @Before()
    public void setup() {
        System.setProperty("webdriver.chromedriver", "C:\\Users\\llis\\Desktop\\MOJE\\INTELLIJ\\src\\test\\java\\CucumberFramework\\resources");
        this.driver = new ChromeDriver();
        this.driver.manage().window().maximize();
        this.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
    }

    @Given("^User navigates to stackoverflow website$")
    public void userNavigatesToStackoverflowWebsite() throws Throwable {
        driver.get("https://stackoverflow.com/");
    }

    @Given("^User clicks on the login button$")
    public void userClicksOnTheLoginButton() throws Throwable {
        driver.findElement(By.xpath("//a[contains(text(), 'Log In')]")).click();
    }

    @Given("^User enters a correct username$")
    public void userEntersACorrectUsername() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("lisiasty86@gmail.com");
    }

    @Given("^User enters a correct password$")
    public void userEntersACorrectPassword() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Niemabata86");
    }

    @When("^User clicks on the login buttonx$")
    public void userClicksOnTheLoginButtonx() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"submit-button\"]")).click();
    }

    @Then("^User should be taken to the successful login page$")
    public void userShouldBeTakenToTheSuccessfulLoginPage() throws Throwable {
        Thread.sleep(3000);
        WebElement askQuestionButton = driver.findElement(By.xpath("//a[contains(text(), 'Ask Question')]"));
        Assert.assertEquals(true, askQuestionButton.isDisplayed());
    }


    /*@Given("^User navigates to stackoverflow website(\\d+)$")
    public void userNavigatesToStackoverflowWebsite(int arg0) throws Throwable {
        System.out.println("userNavigatesToStackoverflowWebsite2");
    }

    @Given("^User clicks on the login button(\\d+)$")
    public void userClicksOnTheLoginButton(int arg0) throws Throwable {
        System.out.println("userClicksOnTheLoginButton2");
    }

    @Given("^User enters a correct username(\\d+)$")
    public void userEntersACorrectUsername(int arg0) throws Throwable {
        System.out.println("userEntersACorrectUsername2");
    }

    @Given("^User enters a correct password(\\d+)$")
    public void userEntersACorrectPassword(int arg0) throws Throwable {
        System.out.println("userEntersACorrectPassword2");
    }

    @When("^User clicks on the login buttonx(\\d+)$")
    public void userClicksOnTheLoginButtonx(int arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^User should be taken to the successful login page(\\d+)$")
    public void userShouldBeTakenToTheSuccessfulLoginPage(int arg0) throws Throwable {
        System.out.println("userShouldBeTakenToTheSuccessfulLoginPage2");
    }*/
}