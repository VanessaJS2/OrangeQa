package co.com.orange.certification.stepdefinitions;

import co.com.orange.certification.question.ValidateHireQuestion;
import co.com.orange.certification.task.Form;
import co.com.orange.certification.task.Login;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import io.github.bonigarcia.wdm.WebDriverManager;

import static co.com.orange.certification.utils.Constans.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static org.hamcrest.CoreMatchers.equalTo;

public class LoginRoleStepDefinitions {

    @Before

    public void preparation() {
        setTheStage(new OnlineCast());
        theActorCalled(ACTOR);
        WebDriverManager.chromedriver().setup();
    }

    @Given("I navigate to the login page")
    public void i_navigate_to_the_login_page() {
        theActorInTheSpotlight().wasAbleTo(Open.url("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"));
    }
    @When("I log in with valid credentials")
    public void i_log_in_with_valid_credentials() {
        theActorInTheSpotlight().attemptsTo(Login.login());
    }
    @When("I fill out the corresponding form with valid information")
    public void i_fill_out_the_corresponding_form_with_valid_information() {
        theActorInTheSpotlight().attemptsTo((Form.form()));
    }
    @Then("all entered fields should be validated against the expected")
    public void all_entered_fields_should_be_validated_against_the_expected() {
        theActorInTheSpotlight().should(seeThat(ValidateHireQuestion.validateHireQuestion(), equalTo(ACTOR+" "+LASTNAME +ROLE +Hired)));

    }

}
