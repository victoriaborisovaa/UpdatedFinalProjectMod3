package stepDefinitions;

import beforeAfter.BeforeAfter;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjects.*;

public class CompletingOrderStepDefinition extends BeforeAfter {
    public WebDriver driver;
    public LoginPage loginPage;
    public CartPage cartPage;
    public CheckoutPage checkoutPage;

    @Given("the user is on the product list page")
    public void userOpensURL(String URL) {
        driver.get(URL);}
    @When("user clicks on add to cart button")
    public void clickOnAddToCart () {
        cartPage.addTShirt();
        cartPage.addBikeLight();
        cartPage.addBabyOnesie();
    }
    @And ("the user should see a confirmation message that the product has been added to the cart")
    public void confirmationMessageDisplayed(){}

    @Then("the user should see the updated cart icon with the item count")
    public void userCheckCountInTheCart() {
        cartPage.checkCart();
    }
    @When("the user clicks on the cart icon to view the cart")
    public void clickCartButton() {
        cartPage.cartBtn();
        cartPage.checkout();
    }
    @Then("the user should see the added product in the cart with the correct details")
    public void checkCart() {
        cartPage.checkCart(); }

    @When("the user click on the Checkout button")
    public void clickOnCheckoutBtn() {
        cartPage.checkout();
    }
    @Then("the user should be directed to the checkout page")
    public void redirectToCheckoutPage() {
    }
    @And("the user should see the added product in the order summary")
    public void seeSummary() {
        cartPage.getCartItemCount();
    }
    @When("the user provides valid shipping information")
    public void enterShippingInfo() {
        checkoutPage.enterFirstName();
        checkoutPage.enterLastName();
        checkoutPage.enterPostalCode();
    }
    @And("selects a valid payment method")
    public void selectPaymentMethod() {
    }
    @And("clicks the Place Order button")
    public void clickPlaceOrderBtn () {
        checkoutPage.finishButtonClick();
    }
    @Then("the user should see an order confirmation message")

    public void seeConfirmationMessage() {
        checkoutPage.completeOrderFinal();
        driver.quit();
    }
}
