package stepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.ShoppingItems;

/**
 * Created by Hema on 04-Mar-19.
 */
public class AddItemStepDefinition {
    ShoppingItems shop = new ShoppingItems();
    @Given("^I have logged in with my account$")
    public void i_have_logged_in_with_my_account() throws Throwable {
        shop.verifyLogin();
    }

    @When("^I add to cart$")
    public void i_add_to_cart() throws Throwable {
        shop.addToCart();
    }

    @Then("^the selected item is added to cart$")
    public void the_selected_item_is_added_to_cart() throws Throwable {
        shop.verifyAddeditem();
        shop.exit();
    }

    @And("^I have searched for item (.+)$")
    public void i_have_searched_for(String itemname) throws Throwable {
        shop.searchItem(itemname);
    }

    @And("^I have selected first item$")
    public void i_have_selected_first_item() throws Throwable {
        shop.selectResult();
    }

}
