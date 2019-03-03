package stepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.ShoppingItems;

/**
 * Created by Hema on 04-Mar-19.
 */
public class CheckoutStepDefinition {
    ShoppingItems shop = new ShoppingItems();
    @Given("^I have navigated \"([^\"]*)\" and logged in with my account \"([^\"]*)\" \"([^\"]*)\"$")
    public void i_have_navigated_and_logged_in_with_my_account(String strArg1, String strArg2, String strArg3) throws Throwable {
        shop.navigationForHomePage(strArg1);
        shop.enterUsername(strArg2);
        shop.enterPassword(strArg3);
        shop.Signin();
        shop.verifyLogin();
    }

    @When("^I checkout$")
    public void i_checkout() throws Throwable {
        shop.checkout();
    }

    @Then("^I navigate to checkout page$")
    public void i_navigate_to_checkout_page() throws Throwable {
        shop.verifyCheckout();
    }

    @And("^I navigated to shopping cart page$")
    public void i_navigated_to_shopping_cart_page() throws Throwable {
        shop.navigateShoppingCart();
    }


}
