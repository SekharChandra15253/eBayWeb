package stepdefinitions;

import io.cucumber.java.en.*;
import pages.*;

public class EbaySteps {

    HomePage home = new HomePage();
    SearchResultsPage search = new SearchResultsPage();
    ProductPage product = new ProductPage();
    CartPage cart = new CartPage();

    @Given("user launches browser")
    public void launchBrowser() {
        home.launchBrowser();
    }

    @When("user navigates to ebay website")
    public void openSite() {
        home.openEbay();
    }

    @When("user searches for {string}")
    public void searchItem(String item) {
        home.search(item);
    }

    @When("user selects first product")
    public void selectProduct() {
        search.clickFirstItem();
    }

    @When("user adds product to cart")
    public void addToCart() {
        product.addToCart();
    }

    @Then("cart should be updated with item count")
    public void verifyCart() {
        cart.verifyCart();
    }
}