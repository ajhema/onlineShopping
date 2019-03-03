package stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.ShoppingItems;

/**
 * Created by Hema on 03-Mar-19.
 */
public class LoginStepDefinition {
    ShoppingItems shop = new ShoppingItems();
    @Given("^I have navigated to homepage \"([^\"]*)\"$")
    public void i_have_navigated_to_homepage(String strArg1) throws Throwable {
        shop.navigationForHomePage(strArg1);
    }

    @When("^I enter username \"([^\"]*)\"$")
    public void i_enter_username(String strArg1) throws Throwable {
        shop.enterUsername(strArg1);
    }

    @Then("^I am logged in with my account$")
    public void i_am_logged_in_with_my_account() throws Throwable {
        shop.verifyLogin();
    }

    @And("^I landed on sign in page$")
    public void i_landed_on_sign_in_page() throws Throwable {
        shop.verifySigninPage();
    }

    @And("^I enter password \"([^\"]*)\"$")
    public void i_enter_password(String strArg1) throws Throwable {
        shop.enterPassword(strArg1);
    }

    @And("^I click on sign in button$")
    public void i_click_on_sign_in_button() throws Throwable {
        shop.Signin();
    }

}
